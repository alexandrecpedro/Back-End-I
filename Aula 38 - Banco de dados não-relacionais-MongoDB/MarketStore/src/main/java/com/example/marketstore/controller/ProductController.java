package com.example.marketstore.controller;

import com.example.marketstore.model.ProductModel;
import com.example.marketstore.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    /** Attributes **/
    private ProductService productService;

    /** Constructor **/
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /** Methods **/
    @PostMapping
    public ProductModel saveProduct(@RequestBody ProductModel productModel) {
        return productService.save(productModel);
    }

    @GetMapping
    public List<ProductModel> findAll() {
        return productService.findAll();
    }
}
