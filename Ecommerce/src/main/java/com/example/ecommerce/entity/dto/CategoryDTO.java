package com.example.ecommerce.entity.dto;

import com.example.ecommerce.entity.CategoryEntity;

public class CategoryDTO {
    /** Attribute **/
    private String name;

    /** Constructor **/
    public CategoryDTO() {
    }

    public CategoryDTO(CategoryEntity categoryEntity) {
        this.name = categoryEntity.getName();
    }

    /** Getters/Setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
