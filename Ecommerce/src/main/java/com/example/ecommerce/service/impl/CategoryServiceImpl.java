package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.CategoryEntity;
import com.example.ecommerce.entity.ProductEntity;
import com.example.ecommerce.entity.dto.CategoryDTO;
import com.example.ecommerce.entity.dto.ProductDTO;
import com.example.ecommerce.exception.NotFoundException;
import com.example.ecommerce.repository.ICategoryRepository;
import com.example.ecommerce.service.ICommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICommerceService<CategoryDTO> {
    /** Attributes **/
    @Autowired
    private ICategoryRepository categoryRepository;

    /** Methods **/
    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        // Convert DTO to Entity
        CategoryEntity categoryEntity = new CategoryEntity(categoryDTO);
        // getId that is being saved at DB
        categoryEntity = categoryRepository.save(categoryEntity);
        // Convert Entity to DTO
        categoryDTO = new CategoryDTO(categoryEntity);
        return categoryDTO;
    }

    @Override
    public CategoryDTO getById(int id) throws NotFoundException {
        CategoryEntity categoryEntity = categoryRepository.findById(id).orElseThrow(() ->
                new NotFoundException("Not found category with id: " + id));
        return new CategoryDTO(categoryEntity);
    }

    public List<ProductDTO> getProductsByCategory(int id) throws NotFoundException {
        CategoryEntity category = categoryRepository.findById(id).orElseThrow(() ->
                new NotFoundException("Not found category with id: " + id));
        List<ProductEntity> productEntities = category.getProductEntities();

        return null;
    }

    @Override
    public List<CategoryDTO> getAll() {
        return null;
    }

    @Override
    public String delete(int id) {
        categoryRepository.deleteById(id);
        return "Successfully deleted";
    }

    @Override
    public CategoryDTO update(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity(categoryDTO);
        categoryRepository.saveAndFlush(categoryEntity);
        return categoryDTO;
    }

    public boolean ifCategoryExists(int id) {
        return categoryRepository.existsById(id);
    }

    public CategoryDTO getByName(String name) {
        // Form 1 - Hibernate
        //CategoryEntity category = categoryRepository.findByName(name);
        // Form 2 - HQL
        //CategoryEntity category = categoryRepository.getByName(name);
        // Form 3 - SQL Native
        CategoryEntity category = categoryRepository.getByNameSQL(name);
        CategoryDTO categoryDTO = new CategoryDTO(category);
        return categoryDTO;
    }
}
