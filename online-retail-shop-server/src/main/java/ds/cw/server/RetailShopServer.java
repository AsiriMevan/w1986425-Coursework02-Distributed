/**
 * @author : Mevan Senanayake
 * Date : 5/22/2023
 * Time : 9:31 PM
 * Package Name : ds.cw.server
 * Project Name : online-retail-shop-server
 */
package ds.cw.server;

import ds.cw.nameservice.NameServiceClient;
import ds.cw.synchronization.DistributedLock;
import ds.cw.synchronization.DistributedTx;
import ds.cw.synchronization.DistributedTxCoordinator;
import ds.cw.synchronization.DistributedTxParticipant;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class RetailShopServer {
    public static final String NAME_SERVICE_ADDRESS = "http://localhost:2379";
    private static int serverPort;
    private static DistributedLock leaderLock;
    private static AtomicBoolean isLeader = new AtomicBoolean(false);
    private static byte[] leaderData;
    private Map<Integer, Integer> retailShop = new HashMap();
    private DistributedTx transaction;
    private RetailShopServiceImpl retailShopService;

    public RetailShopServer(String host, int port) throws InterruptedException, IOException, KeeperException {
        System.out.println("Server:Port " + host + ":" + port);
        this.serverPort = port;
        leaderLock = new DistributedLock("RetailShopServerRWLock", buildServerData(host, port));

        retailShopService = new RetailShopServiceImpl(this);
        transaction = new DistributedTxParticipant(retailShopService);
    }

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.out.println("Usage executable-name <port>");
        }

        DistributedTx.setZooKeeperURL("localhost:2181");
        DistributedLock.setZooKeeperURL("localhost:2181");

        serverPort = Integer.parseInt(args[0]);


        RetailShopServer retailShopServer = new RetailShopServer("localhost", serverPort);
        retailShopServer.startServer();

    }

    public static String buildServerData(String IP, int port) {
        StringBuilder builder = new StringBuilder();
        builder.append(IP).append(":").append(port);
        return builder.toString();
    }

    public DistributedTx getTransaction() {
        return transaction;
    }

    public int getRetailShopStock(Integer itemId) {
        Integer value = retailShop.get(itemId);
        return (value != null) ? value : 0;
    }

    public void setRetailShopStock(Integer itemId, Integer itemStock) {
        retailShop.put(itemId, itemStock);
        System.out.println("itemId itemStock: " + itemId + " " + itemStock);
    }

    public void orderRetailShopStock(Integer itemIdForOrder, Integer itemStockForOrder) {
        retailShop.replace(itemIdForOrder, itemStockForOrder);
        System.out.println("itemIdForOrder itemStockForOrder: " + itemIdForOrder + " " + itemStockForOrder);
    }

    public boolean isLeader() {
        return isLeader.get();
    }

    public void startServer() {
        Server server = ServerBuilder
                .forPort(serverPort)
                .addService(retailShopService)
                .build();
        try {
            server.start();
            tryToBeLeader();

            NameServiceClient client = new NameServiceClient(NAME_SERVICE_ADDRESS);
            client.registerService("RetailShopService", "127.0.0.1", serverPort, "tcp");

            System.out.println("RetailShopServer Started and ready to accept requests on port " + serverPort);
            server.awaitTermination();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public synchronized String[] getCurrentLeaderData() {
        return new String(leaderData).split(":");
    }

    private static synchronized void setCurrentLeaderData(byte[] leaderData) {
        RetailShopServer.leaderData = leaderData;
    }

    public List<String[]> getOthersData() throws KeeperException, InterruptedException {
        List<String[]> result = new ArrayList<>();
        List<byte[]> othersData = leaderLock.getOthersData();
        for (byte[] data : othersData) {
            String[] dataStrings = new String(data).split(":");
            result.add(dataStrings);
        }
        return result;
    }

    private void tryToBeLeader() throws KeeperException, InterruptedException {
        Thread leaderCampaignThread = new Thread(new LeaderCampaignThread());
        leaderCampaignThread.start();
    }

    private void beTheLeader() {
        System.out.println("I got the leader lock. Now acting as primary");
        isLeader.set(true);
        transaction = new DistributedTxCoordinator(retailShopService);
    }

    class LeaderCampaignThread implements Runnable {
        private byte[] currentLeaderData = null;

        @Override
        public void run() {
            System.out.println("Starting the leader Campaign");
            try {
                boolean leader = leaderLock.tryAcquireLock();
                while (!leader) {
                    byte[] leaderData = leaderLock.getLockHolderData();
                    if (currentLeaderData != leaderData) {
                        currentLeaderData = leaderData;
                        setCurrentLeaderData(currentLeaderData);
                    }
                    Thread.sleep(10000);
                    leader = leaderLock.tryAcquireLock();
                }
                System.out.println("I got the leader lock. Now acting as primary");
                currentLeaderData = null;
                beTheLeader();
            } catch (Exception e) {
            }
        }
    }
}

