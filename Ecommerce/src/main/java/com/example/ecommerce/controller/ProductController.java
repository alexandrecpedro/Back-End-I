package com.example.ecommerce.controller;

import com.example.ecommerce.entity.dto.ProductDTO;
import com.example.ecommerce.service.impl.ProductServiceImpl;
import com.example.ecommerce.validations.ValidationProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    /** Attributes **/
    @Autowired
    private ProductServiceImpl productService;

    private ValidationProduct validationProduct = new ValidationProduct();
    
    /** Methods **/
    @PostMapping
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO productDTO) {
        ResponseEntity responseEntity = null;
        String error = validationProduct.validationProductVariables(productDTO);
        if (error.equals(null)) {
            ProductDTO productDTO1 = productService.create(productDTO);
            responseEntity = ResponseEntity.ok(productDTO1);
        } else {
            responseEntity = ResponseEntity.badRequest().body("Title not found");
        }
        return responseEntity;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getById(@PathVariable int id) {
        ResponseEntity responseEntity = null;
        ProductDTO productDTO = productService.getById(id);

        if (!productDTO.equals(null)) {
            responseEntity = ResponseEntity.ok(productDTO);
        } else {
            responseEntity = ResponseEntity.notFound().build();
        }
        return responseEntity;
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
