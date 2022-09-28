package com.example.ecommerce.controller;

import com.example.ecommerce.entity.dto.CategoryDTO;
import com.example.ecommerce.exception.NotFoundException;
import com.example.ecommerce.service.impl.CategoryServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SecurityRequirement(name = "Bearer Authentication")
@RestController
@RequestMapping("/category")
public class CategoryController {
    /** Attributes **/
    @Autowired
    private CategoryServiceImpl categoryService;

    /** Methods **/
    @Operation(summary = "Save categories")
    @PostMapping
    public CategoryDTO create(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.create(categoryDTO);
    }

    @Operation(summary = "Find category by ID")
    @GetMapping("/{id}")
    public CategoryDTO getById(@PathVariable int id) throws NotFoundException {
        return categoryService.getById(id);
    }

    @Operation(summary = "Find category by name", description = "Give a category name to find the desirable category")
    @GetMapping("/getByName")
    public CategoryDTO getByName(@RequestParam(value = "name") String name) {
        return categoryService.getByName(name);
    }

    @Operation(summary = "Find all categories")
    @GetMapping
    public List<CategoryDTO> getAll() {
        return categoryService.getAll();
    }

    @Operation(summary = "Update category")
    @PutMapping
    public CategoryDTO update(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.update(categoryDTO);
    }

    @Operation(summary = "Delete category")
    @DeleteMapping("/{id}")
    public String delete(@RequestParam(value = "id") int id) {
        return categoryService.delete(id);
    }
}
