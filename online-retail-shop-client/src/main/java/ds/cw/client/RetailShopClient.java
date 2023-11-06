/**
 * @author : Mevan Senanayake
 * Date : 5/22/2023
 * Time : 11:20 PM
 * Package Name : ds.cw.client
 * Project Name : online-retail-shop-client
 */
package ds.cw.client;

import java.io.IOException;
import java.util.Scanner;

public class RetailShopClient {
    public static String host = null;
    public static int port = -1;

    public static void main(String[] args) throws InterruptedException, IOException {
        RetailShopClient retailShopClient = new RetailShopClient();
        retailShopClient.initScreen();

    }

    private void initScreen() throws InterruptedException, IOException {

        Scanner userInput = new Scanner(System.in);
        System.out.println("\n");
        System.out.println("----------------------------");
        System.out.println("---------C L I E N T--------");
        System.out.println("----------------------------");
        System.out.println("Type (1) to Add/Update RetailShop");
        System.out.println("Type (2) to List the items");
        System.out.println("Type (3) to Order An Item");
        System.out.println("Type (4) to Log out from the System");
        System.out.println("---------------------------------------------------------------------------");
        System.out.print("Enter your selection to proceed : ");
        int selection = Integer.parseInt(userInput.nextLine().trim());

        switch (selection) {
            case 1:
                new SetRetailShopItemStockClient();
                initScreen();
            case 2:
                new CheckRetailShopItemStockClient();
                initScreen();
            case 3:
                new OrderRetailShopItemClient();
                initScreen();
            case 4:
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("---------------------------- Logged out -----------------------------");
                System.out.println("---------------------------------------------------------------------------");
                break;
        }

    }
}
