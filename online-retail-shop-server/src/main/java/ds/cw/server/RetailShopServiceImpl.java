/**
 * @author : Mevan Senanayake
 * Date : 5/22/2023
 * Time : 9:44 PM
 * Package Name : ds.cw.server
 * Project Name : online-retail-shop-server
 */
package ds.cw.server;

import ds.cw.grpc.generated.*;
import ds.cw.synchronization.DistributedLock;
import ds.cw.synchronization.DistributedTxCoordinator;
import ds.cw.synchronization.DistributedTxListener;
import ds.cw.synchronization.DistributedTxParticipant;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javafx.util.Pair;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class RetailShopServiceImpl extends RetailShopServiceGrpc.RetailShopServiceImplBase implements DistributedTxListener {

    public static final String ZOOKEEPER_URL = "127.0.0.1:2181";
    private static final SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
    RetailShopServiceGrpc.RetailShopServiceBlockingStub clientStub = null;
    private RetailShopServer server;
    private ManagedChannel channel = null;
    private Pair<Integer, Integer> tempDataHolder;
    private boolean transactionStatus = false;
    private String updateType = "";

    public RetailShopServiceImpl(RetailShopServer server) {
        this.server = server;
    }

    private static void accessSharedResource() throws InterruptedException {
        Random r = new Random();
        long sleepDuration = Math.abs(r.nextInt() % 20);
        System.out.println("Accessing critical section. Time remaining : " + sleepDuration + " seconds.");
        Thread.sleep(sleepDuration * 1000);
    }

    private static String getCurrentTimeStamp() {
        return timeFormat.format(new Date(System.currentTimeMillis()));
    }

    @Override
    public void checkRetailShopItemStock(ds.cw.grpc.generated.CheckRetailShopItemStockRequest request, io.grpc.stub.StreamObserver<ds.cw.grpc.generated.CheckRetailShopItemStockResponse> responseObserver) {
        DistributedLock.setZooKeeperURL(ZOOKEEPER_URL);

        String lockName = request.getLockName();
        System.out.println("Contesting to acquire lock " + lockName);
        try {
            DistributedLock lock = new DistributedLock(lockName, "dummyData");
            System.out.println("lock: " + lock);
            lock.acquireLock();
            System.out.println("I Got the lock at " + getCurrentTimeStamp());


            int retailShopId = request.getItemId();
            System.out.println("Request for retailShop stock check received..");
            int retailShopStock = getRetailShopStock(retailShopId);
            CheckRetailShopItemStockResponse response = CheckRetailShopItemStockResponse.newBuilder()
                    .setItemStock(retailShopStock)
                    .build();
            System.out.println("Responding, stock for retailShop " + retailShopId + " is " + retailShopStock);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            accessSharedResource();

            lock.releaseLock();
            System.out.println("Releasing the lock " + getCurrentTimeStamp());
        } catch (IOException | KeeperException | InterruptedException e) {
            System.out.println("Error while creating Distributed Lock myLock :" + e.getMessage());
            e.printStackTrace();
        }

    }

    private void startDistributedTx(Integer itemID, Integer value) {
        try {
            server.getTransaction().start(itemID.toString(), String.valueOf(UUID.randomUUID()));
            tempDataHolder = new Pair<>(itemID, value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getRetailShopStock(int retailShopId) {
        System.out.println("Checking stock for retailShop " + retailShopId);
        //return new Random().nextInt() * 10000;
        return server.getRetailShopStock(retailShopId);
    }

    public void setRetailShopItemStock(ds.cw.grpc.generated.SetRetailShopItemStockRequest request, io.grpc.stub.StreamObserver<ds.cw.grpc.generated.SetRetailShopItemStockResponse> responseObserver) {

        updateType = "NEW";


        Integer itemId = request.getItemId();
        Integer value = request.getValue();
        if (server.isLeader()) {
            // Act as primary
            try {
                System.out.println("Updating retailShop stock as Primary");
                startDistributedTx(itemId, value);
                updateSecondaryServers(itemId, value);
                System.out.println("going to perform");
                if (value > 0) {
                    ((DistributedTxCoordinator) server.getTransaction()).perform();
                } else {
                    ((DistributedTxCoordinator) server.getTransaction()).sendGlobalAbort();
                }
            } catch (Exception e) {
                System.out.println("Error while updating the retailShop stock" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            // Act As Secondary
            if (request.getIsSentByPrimary()) {
                System.out.println("Updating retailShop stock on secondary, on Primary's command");
                startDistributedTx(itemId, value);
                if (value != 0.0d) {
                    ((DistributedTxParticipant) server.getTransaction()).voteCommit();
                } else {
                    ((DistributedTxParticipant) server.getTransaction()).voteAbort();
                }
            } else {
                SetRetailShopItemStockResponse response = callPrimary(itemId, value);
                if (response.getStatus() == true) {
                    transactionStatus = true;
                } else {
                    transactionStatus = false;
                }
            }
        }
        SetRetailShopItemStockResponse response = SetRetailShopItemStockResponse
                .newBuilder()
                .setStatus(transactionStatus)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private void updateRetailShop() {

        if (tempDataHolder != null) {
            Integer itemId = tempDataHolder.getKey();
            Integer value = tempDataHolder.getValue();
            Integer currentStock = server.getRetailShopStock(itemId);

            System.out.println("Update Type: " + updateType);
            if (updateType == "NEW") {
                Integer totalStock = (currentStock + value);
                System.out.println("totalStock " + totalStock);
                server.setRetailShopStock(itemId, totalStock);
                transactionStatus = true;
            } else {
                transactionStatus = false;
            }

            if (updateType == "ORDER" && value <= currentStock && currentStock != 0) {
                Integer remainingStock = (currentStock - value);
                System.out.println("remainingStock " + remainingStock);
                server.orderRetailShopStock(itemId, remainingStock);
                transactionStatus = true;
            } else if (updateType == "ORDER") {
                transactionStatus = false;
            }

            System.out.println("RetailShop " + itemId + " updated to value " + value + " committed");
            tempDataHolder = null;
        }
    }

    private SetRetailShopItemStockResponse callServer(Integer itemId, Integer value, boolean isSentByPrimary, String IPAddress, int port) {
        System.out.println("Call Server " + IPAddress + ":" + port);
        channel = ManagedChannelBuilder.forAddress(IPAddress, port)
                .usePlaintext()
                .build();
        clientStub = RetailShopServiceGrpc.newBlockingStub(channel);
        SetRetailShopItemStockRequest request = SetRetailShopItemStockRequest
                .newBuilder()
                .setItemId(itemId)
                .setValue(value)
                .setIsSentByPrimary(isSentByPrimary)
                .build();
        SetRetailShopItemStockResponse response = clientStub.setRetailShopItemStock(request);
        return response;
    }

    private SetRetailShopItemStockResponse callPrimary(Integer itemId, Integer value) {
        System.out.println("Calling Primary server");
        String[] currentLeaderData = server.getCurrentLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(itemId, value, false, IPAddress, port);
    }

    private void updateSecondaryServers(Integer itemId, Integer value) throws KeeperException, InterruptedException {
        System.out.println("Updating secondary servers");
        List<String[]> othersData = server.getOthersData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(itemId, value, true, IPAddress, port);
        }
    }

    @Override
    public void onGlobalCommit() {
        updateRetailShop();
    }

    @Override
    public void onGlobalAbort() {
        tempDataHolder = null;
        System.out.println("Transaction Aborted by the Coordinator");
    }

    @Override
    public void orderRetailShopItem(ds.cw.grpc.generated.OrderRetailShopItemRequest request, io.grpc.stub.StreamObserver<ds.cw.grpc.generated.OrderRetailShopItemResponse> responseObserver) {

        updateType = "ORDER";

        Integer itemIdForOrder = request.getItemIdForOrder();
        Integer valueForOrder = request.getValueForOrder();
        if (server.isLeader()) {
            // Act as primary
            try {
                System.out.println("Updating inventory stock as Primary");
                startDistributedTx(itemIdForOrder, valueForOrder);
                updateSecondaryServersForOrder(itemIdForOrder, valueForOrder);
                System.out.println("going to perform");
                if (valueForOrder > 0) {
                    ((DistributedTxCoordinator) server.getTransaction()).perform();
                } else {
                    ((DistributedTxCoordinator) server.getTransaction()).sendGlobalAbort();
                }
            } catch (Exception e) {
                System.out.println("Error while updating the retailShop stock" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            // Act As Secondary
            if (request.getIsSentByPrimary()) {
                System.out.println("Updating retailShop stock on secondary, on Primary's command");
                startDistributedTx(itemIdForOrder, valueForOrder);
                if (valueForOrder != 0.0d) {
                    ((DistributedTxParticipant) server.getTransaction()).voteCommit();
                } else {
                    ((DistributedTxParticipant) server.getTransaction()).voteAbort();
                }
            } else {
                OrderRetailShopItemResponse responseForOrder = callPrimaryForOrder(itemIdForOrder, valueForOrder);
                if (responseForOrder.getStatus() == true) {
                    transactionStatus = true;
                } else {
                    transactionStatus = false;
                }
            }
        }
        OrderRetailShopItemResponse responseForOrder = OrderRetailShopItemResponse
                .newBuilder()
                .setItemIdForOrder(itemIdForOrder)
                .setValueForOrder(valueForOrder)
                .setStatus(transactionStatus)
                .build();
        responseObserver.onNext(responseForOrder);
        responseObserver.onCompleted();
    }

    private OrderRetailShopItemResponse callServerForOrder(Integer itemIdForOrder, Integer valueForOrder, boolean isSentByPrimary, String IPAddress, int port) {
        System.out.println("Call Server " + IPAddress + ":" + port);
        channel = ManagedChannelBuilder.forAddress(IPAddress, port)
                .usePlaintext()
                .build();
        clientStub = RetailShopServiceGrpc.newBlockingStub(channel);
        OrderRetailShopItemRequest request = OrderRetailShopItemRequest
                .newBuilder()
                .setItemIdForOrder(itemIdForOrder)
                .setValueForOrder(valueForOrder)
                .setIsSentByPrimary(isSentByPrimary)
                .build();
        OrderRetailShopItemResponse response = clientStub.orderRetailShopItem(request);
        return response;
    }

    private OrderRetailShopItemResponse callPrimaryForOrder(Integer itemIdForOrder, Integer valueForOrder) {
        System.out.println("Calling Primary server");
        String[] currentLeaderData = server.getCurrentLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServerForOrder(itemIdForOrder, valueForOrder, false, IPAddress, port);
    }

    private void updateSecondaryServersForOrder(Integer itemIdForOrder, Integer valueForOrder) throws KeeperException, InterruptedException {
        System.out.println("Updating secondary servers");
        List<String[]> othersData = server.getOthersData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServerForOrder(itemIdForOrder, valueForOrder, true, IPAddress, port);
        }
    }
}
