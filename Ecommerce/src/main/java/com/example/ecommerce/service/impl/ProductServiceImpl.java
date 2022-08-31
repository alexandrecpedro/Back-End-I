package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.ProductEntity;
import com.example.ecommerce.entity.dto.CategoryDTO;
import com.example.ecommerce.entity.dto.ProductDTO;
import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.service.ICommerceService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        ProductEntity productEntity = mapperDTOToEntity(productDTO);
        productEntity.setCategory(categoryService.getByName(productDTO.getCategory()));
        if (productEntity.getCategory() != 0)
            productRepository.create(productEntity);

        return productDTO;
    }

    @Override
    public ProductDTO getById(int id) {
        ProductEntity productEntity = productRepository.getById(id);
        // Converting ProductEntity to ProductDTO
        ProductDTO productDTO = mapperEntityToDTO(productEntity);
        productDTO.setCategory(getNameCategory(productEntity));

        return productDTO;
    }

    @Override
    public List<ProductDTO> getAll() {
        // Recover all productEntities
        List<ProductEntity> productEntities = productRepository.getAll();
        // Create a new list
        List<ProductDTO> productDTOs = new ArrayList<>();

        // Converting productEntities to productDTOs
        for (ProductEntity product : productEntities) {
            ProductDTO productDTO = mapperEntityToDTO(product);
            productDTO.setCategory(getNameCategory(product));
            productDTOs.add(productDTO);
        }

        return productDTOs;
    }

    @Override
    public String delete(int id) {
        return productRepository.delete(id);
    }

    @Override
    public ProductDTO update(ProductDTO productDTO, int id) {
        ProductEntity productEntity = mapperDTOToEntity(productDTO);
        productEntity.setCategory(categoryService.getByName(productDTO.getCategory()));
        productEntity.setId(id);

        if (productEntity.getCategory() != 0)
            productRepository.create(productEntity);

        return productDTO;
    }

    public CategoryDTO getCategoryDTO(ProductEntity productEntity) {
        return categoryService.getById(productEntity.getCategory());
    }

    public String getNameCategory(ProductEntity productEntity) {
        return getCategoryDTO(productEntity).getName();
    }

    public ProductEntity mapperDTOToEntity(ProductDTO productDTO) {
        ObjectMapper objectMapper = new ObjectMapper();
        ProductEntity product = objectMapper.convertValue(productDTO, ProductEntity.class);
        return product;
    }

    public ProductDTO mapperEntityToDTO(ProductEntity productEntity) {
        ObjectMapper objectMapper = new ObjectMapper();
        ProductDTO product = objectMapper.convertValue(productEntity, ProductDTO.class);
        return product;
    }
}
