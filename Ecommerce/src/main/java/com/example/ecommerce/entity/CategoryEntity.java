package com.example.ecommerce.entity;

import com.example.ecommerce.entity.dto.CategoryDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Categories")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CategoryEntity {
    /** Attributes **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, targetEntity = ProductEntity.class)
    @JsonIgnore
    private List<ProductEntity> productEntities = new ArrayList<>();

    /** Constructor **/
    public CategoryEntity() {
    }

    public CategoryEntity(CategoryDTO categoryDTO) {
        this.id = categoryDTO.getId();
        this.name = categoryDTO.getName();
    }

    /** Getters/Setters **/
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }
}
