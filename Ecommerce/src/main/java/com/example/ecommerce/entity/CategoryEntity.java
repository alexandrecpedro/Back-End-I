package com.example.ecommerce.entity;

import com.example.ecommerce.entity.dto.CategoryDTO;

public class CategoryEntity {
    /** Attributes **/
    private int id;
    private String name;

    /** Constructor **/
    public CategoryEntity(CategoryDTO categoryDTO) {
        this.name = categoryDTO.getName();
    }

    /** Getters/Setters **/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
