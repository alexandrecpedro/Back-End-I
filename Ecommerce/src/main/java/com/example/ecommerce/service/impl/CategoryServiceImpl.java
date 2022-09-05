package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.CategoryEntity;
import com.example.ecommerce.entity.dto.CategoryDTO;
import com.example.ecommerce.repository.ICategoryRepository;
import com.example.ecommerce.service.ICommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public CategoryDTO getById(int id) {
        CategoryEntity categoryEntity = categoryRepository.findById(id).get();
        return new CategoryDTO(categoryEntity);
    }

//    public int getByName(String name) {
//        return categoryRepository.getByName(name);
//    }

    @Override
    public List<CategoryDTO> getAll() {
        // Recover all productEntities
        List<CategoryEntity> categoryEntities = categoryRepository.findAll();
        // Create a new list
        List<CategoryDTO> categoryDTOs = new ArrayList<>();

        // Converting productEntities to productDTOs
        for (CategoryEntity category : categoryEntities) {
        }

        return categoryDTOs;
    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public CategoryDTO update(CategoryDTO categoryDTO, int id) {
        return null;
    }
}
