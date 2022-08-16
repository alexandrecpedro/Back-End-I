package Pharmacy.medicine.model;

import java.text.NumberFormat;

public class Medicine {
    /** Data Format **/
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    /** Attributes **/
    private Long id;
    private String name, laboratory;
    private int quantity;
    private double price;

    /** Constructor **/
    public Medicine() {
    }

    public Medicine(String name, String laboratory, int quantity, double price) {
        this.name = name;
        this.laboratory = laboratory;
        this.quantity = quantity;
        this.price = price;
    }

    public Medicine(Long id, String name, String laboratory, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.laboratory = laboratory;
        this.quantity = quantity;
        this.price = price;
    }

    /** Getters/Setters **/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Medicine {" +
                " id = " + id +
                " | name = " + name +
                " | laboratory = " + laboratory +
                " | quantity = " + quantity +
                " | price = " + numberFormat.format(price) +
                " }";
    }
}
