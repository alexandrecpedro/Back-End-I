package com.example.ecommerce.controller;

import com.example.ecommerce.entity.dto.CategoryDTO;
import com.example.ecommerce.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    /** Attributes **/
    @Autowired
    private CategoryServiceImpl categoryService;

    /** Methods **/
    @PostMapping
    public CategoryDTO create(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.create(categoryDTO);
    }

    @GetMapping("/{id}")
    public CategoryDTO getById(@PathVariable int id) {
        return categoryService.getById(id);
    }
}
