package com.example.ecommerceclient.controller;

import com.example.ecommerceclient.entity.dto.ProductDTO;
import com.example.ecommerceclient.service.ProductClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productClient")
public class ProductClientController {
    /** Attribute **/
    @Autowired
    private ProductClientService productClientService;

    /** Methods **/
    @PostMapping("/save")
    public ProductDTO save(@RequestBody ProductDTO productDTO) {
        return productClientService.save(productDTO);
    }

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable int id) {
        return productClientService.findById(id);
    }
}
