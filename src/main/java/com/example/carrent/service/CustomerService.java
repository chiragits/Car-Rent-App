package com.example.carrent.service;

import com.example.carrent.model.Customer;
import java.util.List;

public interface CustomerService {
    void addCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerById(String id);

    boolean updateCustomer(String id, Customer customer);

    boolean deleteCustomer(String id);
}
