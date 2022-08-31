package com.example.ecommerce.repository;

import com.example.ecommerce.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository {
    /** Attributes **/
    private static Map<Integer, ProductEntity> productMap = new HashMap<>();
    private static int idProduct = 1;
    
    /** Methods **/
    public ProductEntity create(ProductEntity productEntity) {
        productEntity.setId(idProduct++);
        productMap.put(productEntity.getId(), productEntity);
        return productEntity;
    }
    
    public ProductEntity getById(int id) {
        return productMap.get(id);
    }

    public List<ProductEntity> getAll() {
        return new ArrayList<>(productMap.values());
    }

    public String delete(int id) {
        productMap.remove(id);
        return "Deleted product";
    }

    public ProductEntity update(ProductEntity productEntity) {
        productMap.put(productEntity.getId(), productEntity);
        return productEntity;
    }
}
