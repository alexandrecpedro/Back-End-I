package com.example.marketstore.controller;

import com.example.marketstore.model.ProductModel;
import com.example.marketstore.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
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
    @Operation(summary = "Registering a new product")
    @PostMapping
    public ProductModel saveProduct(@RequestBody ProductModel productModel) {
        return productService.save(productModel);
    }

    @GetMapping
    public List<ProductModel> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductModel findProduct(@PathVariable Integer id) {
        return productService.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        productService.delete(id);
        return "Deleted product";
    }
}
