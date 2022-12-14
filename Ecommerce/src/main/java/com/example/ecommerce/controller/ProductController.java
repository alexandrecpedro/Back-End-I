package com.example.ecommerce.controller;

import com.example.ecommerce.entity.dto.ProductDTO;
import com.example.ecommerce.exception.NotFoundException;
import com.example.ecommerce.exception.NullVariableException;
import com.example.ecommerce.service.impl.ProductServiceImpl;
import com.example.ecommerce.validations.ValidationProduct;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SecurityRequirement(name = "Bearer Authentication")
@RestController
@RequestMapping("/product")
public class ProductController {
    /** Attributes **/
    @Autowired
    private ProductServiceImpl productService;

    private ValidationProduct validationProduct = new ValidationProduct();
    
    /** Methods **/
    @Operation(summary = "Save products")
    @PostMapping
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO productDTO) throws NullVariableException, NotFoundException {
        ResponseEntity responseEntity = null;
        Boolean error = validationProduct.validationProductVariables(productDTO);
        if (error) {
            ProductDTO productDTO1 = productService.create(productDTO);
            responseEntity = ResponseEntity.ok(productDTO1);
        }
        return responseEntity;
    }

    @Operation(summary = "Find product by ID")
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable int id) throws NotFoundException {
        return new ResponseEntity<>(productService.getById(id), HttpStatus.OK);
    }

    @Operation(summary = "Find all products")
    @GetMapping
    public List<ProductDTO> getAll() {
        return productService.getAll();
    }

    @Operation(summary = "Update product")
    @PutMapping("/{id}")
    public ProductDTO update(@RequestBody ProductDTO productDTO) {
        return productService.update(productDTO);
    }

    @Operation(summary = "Delete product")
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return productService.delete(id);
    }
}
