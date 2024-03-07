package com.example.carrent.repository;

import com.example.carrent.model.Vehicle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehicleRepository extends MongoRepository<Vehicle, String> {

    Vehicle findByRegistrationNumber(String registrationNumber);

    // Optionally, you can add more custom query methods here based on your
    // requirements
}
