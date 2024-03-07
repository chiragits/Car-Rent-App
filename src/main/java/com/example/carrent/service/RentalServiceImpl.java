package com.example.carrent.service;

import com.example.carrent.model.Rental;
import com.example.carrent.repository.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RentalServiceImpl implements RentalService {

    @Autowired
    private RentalRepository rentalRepository;

    @Override
    public void rentVehicle(Rental rental) {
        rentalRepository.save(rental);
    }

    @Override
    public List<Rental> getAllRentals() {
        return rentalRepository.findAll();
    }

    @Override
    public Rental getRentalById(String id) {
        return rentalRepository.findById(id).orElse(null);
    }

    @Override
    public boolean updateRental(String id, Rental updatedRental) {
        Optional<Rental> existingRental = rentalRepository.findById(id);

        if (existingRental.isPresent()) {
            Rental currentRental = existingRental.get();
            currentRental.setVehicle(updatedRental.getVehicle());
            currentRental.setCustomer(updatedRental.getCustomer());
            currentRental.setDays(updatedRental.getDays());
            // Update other fields as needed

            rentalRepository.save(currentRental);
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteRental(String id) {
        if (rentalRepository.existsById(id)) {
            rentalRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
