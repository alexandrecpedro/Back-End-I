package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.ProductEntity;
import com.example.ecommerce.entity.dto.ProductDTO;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.service.ICommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ICommerceService<ProductDTO> {
    /** Attributes **/
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryServiceImpl categoryService;

    /** Methods **/
    @Override
    public ProductDTO create(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity(productDTO);
        productEntity.setCategoryId(categoryService.getByName(productDTO.getCategory()));
        if (productEntity.getCategoryId() != 0)
            productRepository.create(productEntity);

        return productDTO;
    }

    @Override
    public ProductDTO getById(int id) {
        ProductEntity productEntity = productRepository.getById(id);
        // Converting ProductEntity to ProductDTO
        ProductDTO productDTO = new ProductDTO(productEntity);
        productDTO.setCategory(categoryService.getById(productEntity.getCategoryId()).getName());

        return productDTO;
    }
}
