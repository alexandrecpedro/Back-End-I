package com.example.dentist.domain;

public class Dentist {
    /** Attributes **/
    private String name;

    /** Constructor **/
    public Dentist(String name) {
        this.name = name;
    }

    /** Getters/Setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
