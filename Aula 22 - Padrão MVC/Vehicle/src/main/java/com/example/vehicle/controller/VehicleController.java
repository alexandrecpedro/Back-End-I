package com.example.vehicle.controller;

import com.example.vehicle.domain.Vehicle;
import com.example.vehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/listvehicles")
public class VehicleController {
    /** Attribute **/
    private final VehicleService vehicleService;

    /** Constructor **/
    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    /** Method **/
    @GetMapping
    public List<Vehicle> getVehicle() {
        return vehicleService.listVehicles();
    }
}
