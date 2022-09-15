package com.example.bets.model;

public enum Status {
    SCHEDULED("scheduled"),
    TO_START("to start"),
    LIVE("live"),
    ENDED("ended");

    /** Attribute **/
    private String description;

    /** Constructor **/
    Status(String description) {
        this.description = description;
    }

    /** Getter **/
    public String getDescription() {
        return description;
    }
}
