/**
 * @author : Mevan Senanayake
 * Date : 5/22/2023
 * Time : 11:30 PM
 * Package Name : ds.cw.client
 * Project Name : online-retail-shop-client
 */
package ds.cw.client;

import ds.cw.grpc.generated.OrderRetailShopItemRequest;
import ds.cw.grpc.generated.OrderRetailShopItemResponse;
import ds.cw.grpc.generated.RetailShopServiceGrpc;
import ds.cw.nameservice.NameServiceClient;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.util.Scanner;

public class OrderRetailShopItemClient {
    public static final String NAME_SERVICE_ADDRESS = "http://localhost:2379";
    RetailShopServiceGrpc.RetailShopServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;
    private ManagedChannel channel = null;

    public OrderRetailShopItemClient() throws InterruptedException, IOException {
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
            System.out.println("\nEnter RetailShop ID to ORDER:");
            int retailShopId = Integer.parseInt(userInput.nextLine().trim());

            System.out.println("\nEnter RetailShop Stocks required for the ORDER:");
            int value = Integer.parseInt(userInput.nextLine().trim());

            String lockName = "orderInv";

            System.out.println("Requesting server to place the order the retailShop for " + retailShopId);
            OrderRetailShopItemRequest request = OrderRetailShopItemRequest.newBuilder()
                    .setLockName(lockName)
                    .setItemIdForOrder(retailShopId)
                    .setValueForOrder(value)
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
            OrderRetailShopItemResponse response = clientStub.orderRetailShopItem(request);

            System.out.println("\n");
            System.out.println("RetailShop update status: " + response.getStatus());

            if (response.getStatus()) {
                System.out.println("Order has been placed to the Item " + response.getItemId() + " for " + response.getValue());
            } else {
                System.out.println("Order couldn't be placed to the Item " + response.getItemId() + " for " + response.getValue());
            }

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
