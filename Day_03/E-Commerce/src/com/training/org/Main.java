package com.training.org;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OrderService service = new OrderService();

        while (true) {
            System.out.println("\n1. Place Online Order");
            System.out.println("2. Place Store Order");
            System.out.println("3. Cancel Order");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Order ID: ");
                        int id1 = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Product: ");
                        String product1 = sc.nextLine();

                        System.out.print("Enter Amount: ");
                        double amount1 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter Address: ");
                        String address = sc.nextLine();

                        Order online = new OnlineOrder(id1, product1, amount1, address);
                        online.placeOrder();
                        service.addOrder(online);
                        break;

                    case 2:
                        System.out.print("Enter Order ID: ");
                        int id2 = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Product: ");
                        String product2 = sc.nextLine();

                        System.out.print("Enter Amount: ");
                        double amount2 = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Enter Store Location: ");
                        String location = sc.nextLine();

                        Order store = new StoreOrder(id2, product2, amount2, location);
                        store.placeOrder();
                        service.addOrder(store);
                        break;

                    case 3:
                        System.out.print("Enter Order ID to cancel: ");
                        int cancelId = sc.nextInt();

                        service.cancelOrder(cancelId);
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (InvalidOrderException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
