package com.example.carrent.repository;

import com.example.carrent.model.Rental;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RentalRepository extends MongoRepository<Rental, String> {

    Rental findByRentalId(String rentalId);

    // Optionally, you can add more custom query methods here based on your
    // requirements
}
