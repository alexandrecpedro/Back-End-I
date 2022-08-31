package com.example.ecommerce.controller;

import com.example.ecommerce.entity.dto.ProductDTO;
import com.example.ecommerce.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    @PutMapping("/{id}")
    public ProductDTO update(@RequestBody ProductDTO productDTO, @PathVariable int id) {
        return productService.update(productDTO, id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return productService.delete(id);
    }
}
