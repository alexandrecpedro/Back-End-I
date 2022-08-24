package com.example.vehicle.domain;

public class Vehicle {
    /** Attributes **/
    private String brand, color;

    /** Constructor **/
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    /** Getters/Setters **/
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
