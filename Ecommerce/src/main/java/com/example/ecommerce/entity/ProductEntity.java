package com.example.ecommerce.entity;

import com.example.ecommerce.entity.dto.ProductDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "Products")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductEntity {
    /** Attributes **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String title;
    private double price;
    private String description;
    private String image;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    /** Constructor **/
    public ProductEntity() {
    }

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

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
}
