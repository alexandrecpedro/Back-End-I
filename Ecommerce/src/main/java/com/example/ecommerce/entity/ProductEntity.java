package com.example.ecommerce.entity;

import com.example.ecommerce.entity.dto.ProductDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ProductEntity {
    /** Attributes **/
    private int id;
    private String title;
    private double price;
    private String description;
    private String image;
    @JsonIgnore
    private int category;

    /** Constructor **/
//    public ProductEntity(ProductDTO productDTO) {
//        this.title = productDTO.getTitle();
//        this.price = productDTO.getPrice();
//        this.description = productDTO.getDescription();
//        this.image = productDTO.getImage();
//    }

    /** Getters/Setters **/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
