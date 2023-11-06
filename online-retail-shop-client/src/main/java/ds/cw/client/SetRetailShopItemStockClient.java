/**
 * @author : Mevan Senanayake
 * Date : 5/22/2023
 * Time : 11:29 PM
 * Package Name : ds.cw.client
 * Project Name : online-retail-shop-client
 */
package ds.cw.client;

import ds.cw.grpc.generated.RetailShopServiceGrpc;
import ds.cw.grpc.generated.SetRetailShopItemStockRequest;
import ds.cw.grpc.generated.SetRetailShopItemStockResponse;
import ds.cw.nameservice.NameServiceClient;
import io.grpc.ConnectivityState;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.IOException;
import java.util.Scanner;

public class SetRetailShopItemStockClient {
    public static final String NAME_SERVICE_ADDRESS = "http://localhost:2379";
    RetailShopServiceGrpc.RetailShopServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;
    private ManagedChannel channel = null;

    public SetRetailShopItemStockClient() throws InterruptedException, IOException {
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
            System.out.println("\nEnter RetailShop ID(ID should be an Integer) -> :");
            int retailShopId = Integer.parseInt(userInput.nextLine().trim());

            System.out.println("\nEnter Item Quantity to add/update -> :");
            int value = Integer.parseInt(userInput.nextLine().trim());

            String locker = "setInv";

            System.out.println("Requesting server to add the retailShop for " + retailShopId);
            SetRetailShopItemStockRequest request = SetRetailShopItemStockRequest.newBuilder()
                    .setLockName(locker)
                    .setItemId(retailShopId)
                    .setValue(value)
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
            SetRetailShopItemStockResponse response = clientStub.setRetailShopItemStock(request);
            System.out.println("\n");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("RetailShop update status: " + response.getStatus());
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
