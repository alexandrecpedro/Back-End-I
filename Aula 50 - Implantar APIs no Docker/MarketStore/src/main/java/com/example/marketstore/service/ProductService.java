package com.example.marketstore.service;

import com.example.marketstore.model.ProductModel;
import com.example.marketstore.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    /** Attributes **/
    private ProductRepository productRepository;

    /** Constructor **/
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /** Methods **/
    public ProductModel save(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    public List<ProductModel> findAll() {
        return productRepository.findAll();
    }
    
    public ProductModel findById(Integer id) {
        return productRepository.findById(id).orElseGet(null);
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }
}
