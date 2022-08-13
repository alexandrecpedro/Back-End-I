package Patient.entities;

import java.util.Date;

public class Patient {
    /** Attributes **/
    private String firstName, lastName, address, rg, username, password;
    private Date registerDate;

    /** Constructor **/
    public Patient() {
    }

    public Patient(String firstName, String lastName, String address, String rg, String username, String password, Date registerDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.rg = rg;
        this.username = username;
        this.password = password;
        this.registerDate = registerDate;
    }

    /** Getters/Setters **/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Patient" +
                "\nFirst Name = " + firstName +
                "\nLast Name = " + lastName +
                "\nRegister Date=" + registerDate;
    }
}
