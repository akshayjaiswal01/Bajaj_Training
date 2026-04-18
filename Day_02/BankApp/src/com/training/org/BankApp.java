package com.training.org;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        SBI bank = new SBI("SBI", "Pune");
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1.Add Customer");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Display All Customers");
            System.out.println("5.Show Transactions");
            System.out.println("6.Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Customer ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Address: ");
                    String addr = sc.next();
                    System.out.print("Enter Mobile: ");
                    String mob = sc.next();
                    System.out.print("Enter Account No: ");
                    int accNo = sc.nextInt();

                    Account acc = new Account(accNo);
                    Customer c = new Customer(id, name, addr, mob, acc);

                    bank.addCustomer(c);
                    System.out.println("Customer Added!");
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    int did = sc.nextInt();
                    Customer dc = bank.findCustomer(did);

                    if (dc != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();
                        dc.getAccount().deposit(amt);
                        System.out.println("Deposited!");
                    } else {
                        System.out.println("Customer Not Found");
                    }
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    int wid = sc.nextInt();
                    Customer wc = bank.findCustomer(wid);

                    if (wc != null) {
                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();

                        if (wc.getAccount().withdraw(amt))
                            System.out.println("Withdraw Successful");
                        else
                            System.out.println("Insufficient Balance");
                    } else {
                        System.out.println("Customer Not Found");
                    }
                    break;

                case 4:
                    bank.displayAllCustomers();
                    break;

                case 5:
                    System.out.print("Enter Customer ID: ");
                    int tid = sc.nextInt();
                    Customer tc = bank.findCustomer(tid);

                    if (tc != null) {
                        tc.getAccount().getTransactions()
                          .forEach(System.out::println);
                    } else {
                        System.out.println("Customer Not Found");
                    }
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
    }
}