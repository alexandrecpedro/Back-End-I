package com.example.vehicle.service.impl;

import com.example.vehicle.domain.Vehicle;
import com.example.vehicle.service.VehicleService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {
    /** Method **/
    @Override
    public List<Vehicle> listVehicles() {
        return Arrays.asList(new Vehicle("Ferrari", "red"),
                new Vehicle("BMW", "silver"));
    }
}
