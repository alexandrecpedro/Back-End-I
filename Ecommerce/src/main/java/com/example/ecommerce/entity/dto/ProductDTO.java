package com.example.ecommerce.entity.dto;

import com.example.ecommerce.entity.ProductEntity;

public class ProductDTO {
    /** Attributes **/
    private String title;
    private double price;
    private String description;
    private String image;
    private String category;

    /** Constructor **/
    public ProductDTO() {
    }

    public ProductDTO(ProductEntity productEntity) {
        this.title = productEntity.getTitle();
        this.price = productEntity.getPrice();
        this.description = productEntity.getDescription();
        this.image = productEntity.getImage();
    }

    /** Getters/Setters **/
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
