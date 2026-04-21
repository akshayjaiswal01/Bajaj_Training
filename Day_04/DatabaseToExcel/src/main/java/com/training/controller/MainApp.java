package com.training.controller;

import java.util.Scanner;

import com.training.entity.Billbook;
import com.training.entity.Customer;
import com.training.service.CustomerService;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerService service = new CustomerService();

        int choice;

        do {
            System.out.println("\n1. Add Customer");
            System.out.println("2. Display Customers");
            System.out.println("3. Find Customer");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Address: ");
                    String addr = sc.nextLine();

                    System.out.print("Enter Mobile: ");
                    String mob = sc.nextLine();

                    System.out.print("Enter Bill ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Bill Date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter Product: ");
                    String product = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Enter Amount: ");
                    double amt = sc.nextDouble();

                    Billbook bill = new Billbook(bid, date, product, qty, amt);
                    Customer cust = new Customer(id, name, addr, mob, bill);

                    service.addCustomer(cust);
                    System.out.println("Customer Added Successfully!");
                    break;

                case 2:
                    for (Customer c : service.displayCustomers()) {
                        System.out.println(c);
                    }
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    int searchId = sc.nextInt();

                    Customer found = service.searchCustomer(searchId);

                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Customer Not Found!");
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}
