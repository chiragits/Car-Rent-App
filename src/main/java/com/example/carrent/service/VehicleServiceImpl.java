package com.example.carrent.service;

import com.example.carrent.model.Vehicle;
import com.example.carrent.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(String id) {
        return vehicleRepository.findById(id).orElse(null);
    }

    @Override
    public boolean updateVehicle(String id, Vehicle updatedVehicle) {
        Optional<Vehicle> existingVehicle = vehicleRepository.findById(id);

        if (existingVehicle.isPresent()) {
            Vehicle currentVehicle = existingVehicle.get();
            currentVehicle.setMake(updatedVehicle.getMake());
            currentVehicle.setModel(updatedVehicle.getModel());
            currentVehicle.setRentPerDay(updatedVehicle.getRentPerDay());
            // Update other fields as needed

            vehicleRepository.save(currentVehicle);
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteVehicle(String id) {
        if (vehicleRepository.existsById(id)) {
            vehicleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
