package com.example.carrent.service;

import com.example.carrent.model.Vehicle;
import java.util.List;

public interface VehicleService {
    void addVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicles();

    Vehicle getVehicleById(String id);

    boolean updateVehicle(String id, Vehicle vehicle);

    boolean deleteVehicle(String id);
}
