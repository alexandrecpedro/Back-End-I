package model;

import java.io.Serializable;
import java.text.NumberFormat;

public class Employee implements Serializable {
    /** Data Conversion **/
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    /** Attributes **/
    private String firstName, lastName, identificationDocument;
    private Double salary;

    /** Constructor **/
    public Employee(String firstName, String lastName, String identificationDocument, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identificationDocument = identificationDocument;
        this.salary = salary;
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

    public String getIdentificationDocument() {
        return identificationDocument;
    }

    public void setIdentificationDocument(String identificationDocument) {
        this.identificationDocument = identificationDocument;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /** Method **/
    @Override
    public String toString() {
        return "Employee" +
                "\nFirst Name = " + firstName +
                "\nLast Name = " + lastName +
                "\nIdentification Document = " + identificationDocument +
                "\nSalary = " + numberFormat.format(salary);
    }
}
