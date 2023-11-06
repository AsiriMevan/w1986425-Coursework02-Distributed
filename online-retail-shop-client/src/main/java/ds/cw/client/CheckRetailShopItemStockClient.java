/**
 * @author : Mevan Senanayake
 * Date : 5/22/2023
 * Time : 11:29 PM
 * Package Name : ds.cw.client
 * Project Name : online-retail-shop-client
 */
package ds.cw.client;

import ds.cw.grpc.generated.CheckRetailShopItemStockRequest;
import ds.cw.grpc.generated.CheckRetailShopItemStockResponse;
import ds.cw.grpc.generated.RetailShopServiceGrpc;
import ds.cw.nameservice.NameServiceClient;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.util.Scanner;

public class CheckRetailShopItemStockClient {
    public static final String NAME_SERVICE_ADDRESS = "http://localhost:2379";
    RetailShopServiceGrpc.RetailShopServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;
    private ManagedChannel channel = null;

    public CheckRetailShopItemStockClient() throws InterruptedException, IOException {
        fetchServerDetails();
        this.initializeConnection();
        this.processUserRequests();
        this.closeConnection();
    }

    private void initializeConnection() {
        System.out.println("Initializing Connecting to server at " + host + ":" + port);
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();
        clientStub = RetailShopServiceGrpc.newBlockingStub(channel);
        channel.getState(true);
    }

    private void closeConnection() {
        channel.shutdown();
    }

    private void processUserRequests() throws InterruptedException, IOException {
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nEnter RetailShop ID to check the stock -> :");
            int retailShopId = Integer.parseInt(userInput.nextLine().trim());

            String locker = "checkInv";

            System.out.println("Requesting server to check the retailShop for " + retailShopId);
            CheckRetailShopItemStockRequest request = CheckRetailShopItemStockRequest.newBuilder()
                    .setLockName(locker)
                    .setItemId(retailShopId)
                    .build();

            ConnectivityState state = channel.getState(true);
            while (state != ConnectivityState.READY) {
                System.out.println("Service unavailable, looking for a service provider..");
                fetchServerDetails();
                initializeConnection();
                Thread.sleep(5000);
                state = channel.getState(true);
            }

            System.out.println("Connection Initialized!");
            CheckRetailShopItemStockResponse response = clientStub.checkRetailShopItemStock(request);
            System.out.println("\n");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Available stock is " + response.getItemStock() + " pcs");
            System.out.println("---------------------------------------------------------------------------");
            Thread.sleep(1000);
            break;
        }
    }

    protected void fetchServerDetails() throws IOException, InterruptedException {
        NameServiceClient client = new NameServiceClient(NAME_SERVICE_ADDRESS);
        NameServiceClient.ServiceDetails serviceDetails = client.findService("RetailShopService");
        host = serviceDetails.getIPAddress();
        port = serviceDetails.getPort();
    }

}
