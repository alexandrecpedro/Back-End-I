package com.example.user.model;

public class User {
    /** Attributes **/
    private String name;
    private int age;

    /** Constructor **/
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** Getters/Setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
