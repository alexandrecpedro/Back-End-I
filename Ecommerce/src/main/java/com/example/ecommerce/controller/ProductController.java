package com.example.ecommerce.controller;

import com.example.ecommerce.entity.dto.ProductDTO;
import com.example.ecommerce.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    /** Attributes **/
    @Autowired
    private ProductServiceImpl productService;
    
    /** Methods **/
    @PostMapping
    public ProductDTO create(@RequestBody ProductDTO productDTO) {
        return productService.create(productDTO);
    }
    
    @GetMapping("/{id}")
    public ProductDTO getById(@PathVariable int id) {
        return productService.getById(id);
    }
}
