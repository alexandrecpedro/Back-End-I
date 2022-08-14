package Airplane.main.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Airplane {
    /** Data Conversion **/
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    /** Attributes **/
    private int id;
    private String brand, model;
    private int registration;
    private Date dateEntryIntoservice;

    /** Constructor **/
    public Airplane() {
    }

    public Airplane(int id, String brand, String model, int registration, Date dateEntryIntoservice) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.registration = registration;
        this.dateEntryIntoservice = dateEntryIntoservice;
    }

    /** Getters/Setters **/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }

    public Date getDateEntryIntoservice() {
        return dateEntryIntoservice;
    }

    public void setDateEntryIntoservice(Date dateEntryIntoservice) {
        this.dateEntryIntoservice = dateEntryIntoservice;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Airplane" +
                "\nid=" + id +
                "\nBrand = " + brand +
                "\nModel = " + model +
                "\nRegistration = " + registration +
                "\nDate entry into service = " + dateEntryIntoservice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return id == airplane.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
