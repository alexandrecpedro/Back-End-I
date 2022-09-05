package com.example.ecommerce.entity.dto;

import com.example.ecommerce.entity.CategoryEntity;

public class CategoryDTO {
    /** Attributes **/
    private int id;
    private String name;

    /** Constructor **/
    public CategoryDTO() {
    }

    public CategoryDTO(CategoryEntity categoryEntity) {
        this.id = categoryEntity.getId();
        this.name = categoryEntity.getName();
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
