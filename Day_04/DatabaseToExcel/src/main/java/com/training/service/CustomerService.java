package com.training.service;

import java.util.ArrayList;

import com.training.entity.Customer;
import com.training.repository.CustomerRepository;

public class CustomerService {
	private CustomerRepository repo = new CustomerRepository();

    public void addCustomer(Customer c) {
        repo.addCustomer(c);
    }

    public ArrayList<Customer> displayCustomers() {
        return repo.getAllCustomers();
    }

    public Customer searchCustomer(int id) {
        return repo.findCustomer(id);
    }
}
