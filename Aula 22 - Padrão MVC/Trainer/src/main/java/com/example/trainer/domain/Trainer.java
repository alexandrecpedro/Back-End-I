package com.example.trainer.domain;

public class Trainer {
    /** Attribute **/
    private String name;

    /** Constructor **/
    public Trainer(String name) {
        this.name = name;
    }

    /** Getter/Setter **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
