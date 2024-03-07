package com.example.carrent.service;

import com.example.carrent.model.Rental;
import java.util.List;

public interface RentalService {
    void rentVehicle(Rental rental);

    List<Rental> getAllRentals();

    Rental getRentalById(String id);

    boolean updateRental(String id, Rental rental);

    boolean deleteRental(String id);
}
