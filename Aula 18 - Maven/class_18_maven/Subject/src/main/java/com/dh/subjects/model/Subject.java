package com.dh.subjects.model;
public class Subject {
    /** Attributes **/
    private Integer id;
    private String firstName;

    /** Constructor **/
    public Subject() {
    }
    public Subject(String firstName) {
        this.firstName = firstName;
    }
    public Subject(Integer id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    /** Getters/Setters **/
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setName(String firstName) {
        this.firstName = firstName;
    }
}
