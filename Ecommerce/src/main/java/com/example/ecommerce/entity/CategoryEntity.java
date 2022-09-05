package com.example.ecommerce.entity;

import com.example.ecommerce.entity.dto.CategoryDTO;

import javax.persistence.*;

@Entity
@Table(name = "Categories")
public class CategoryEntity {
    /** Attributes **/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, nullable = false)
    private String name;

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
}
