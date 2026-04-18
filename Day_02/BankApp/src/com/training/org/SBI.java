package com.training.org;

import java.util.ArrayList;

public class SBI extends Bank {

    private ArrayList<Customer> customers;

    public SBI(String name, String location) {
        super(name, location);
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public Customer findCustomer(int id) {
        for (Customer c : customers) {
            if (c.getCustId() == id)
                return c;
        }
        return null;
    }

    public void displayAllCustomers() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}