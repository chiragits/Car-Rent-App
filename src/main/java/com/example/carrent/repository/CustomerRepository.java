package com.example.carrent.repository;

import com.example.carrent.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByCustomerId(String customerId);

    // Optionally, you can add more custom query methods here based on your
    // requirements
}
