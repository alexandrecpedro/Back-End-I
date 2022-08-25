package com.example.dentalclinic.model;

public class Dentist {
    /** Attributes **/
    private Integer id;
    private String name, email;
    private Integer registrationNumber;
    private Boolean meetsAgreement;

    /** Constructor **/
    public Dentist(String name, String email, Integer registrationNumber, Boolean meetsAgreement) {
        this.name = name;
        this.email = email;
        this.registrationNumber = registrationNumber;
        this.meetsAgreement = meetsAgreement;
    }

    public Dentist(Integer id, String name, String email, Integer registrationNumber, Boolean meetsAgreement) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.registrationNumber = registrationNumber;
        this.meetsAgreement = meetsAgreement;
    }

    /** Getters/Setters **/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(Integer registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Boolean getMeetsAgreement() {
        return meetsAgreement;
    }

    public void setMeetsAgreement(Boolean meetsAgreement) {
        this.meetsAgreement = meetsAgreement;
    }

    /** Method **/
    @Override
    public String toString() {
        return "Dentist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", registrationNumber=" + registrationNumber +
                ", meetsAgreement=" + meetsAgreement +
                '}';
    }
}
