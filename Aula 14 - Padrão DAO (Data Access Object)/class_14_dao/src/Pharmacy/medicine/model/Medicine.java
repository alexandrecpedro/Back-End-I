package Pharmacy.medicine.model;

import java.text.NumberFormat;

public class Medicine {
    /** Data Format **/
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

    /** Attributes **/
    private Integer id;
    private String name, laboratory;
    private Integer quantity;
    private Double price;

    /** Constructor **/
    public Medicine() {
    }

    public Medicine(String name, String laboratory, Integer quantity, Double price) {
        this.name = name;
        this.laboratory = laboratory;
        this.quantity = quantity;
        this.price = price;
    }

    public Medicine(Integer id, String name, String laboratory, Integer quantity, Double price) {
        this.id = id;
        this.name = name;
        this.laboratory = laboratory;
        this.quantity = quantity;
        this.price = price;
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

    public String getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(String laboratory) {
        this.laboratory = laboratory;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Medicine {" +
                " name = " + name +
                " | laboratory = " + laboratory +
                " | quantity = " + quantity +
                " | price = " + numberFormat.format(price) +
                " }";
    }
}
