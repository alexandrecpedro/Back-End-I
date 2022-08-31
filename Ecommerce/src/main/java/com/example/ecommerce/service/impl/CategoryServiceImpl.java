package com.example.ecommerce.service.impl;

import com.example.ecommerce.entity.CategoryEntity;
import com.example.ecommerce.entity.dto.CategoryDTO;
import com.example.ecommerce.repository.CategoryRepository;
import com.example.ecommerce.service.ICommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICommerceService<CategoryDTO> {
    /** Attributes **/
    @Autowired
    private CategoryRepository categoryRepository;

    /** Methods **/
    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        CategoryEntity categoryEntity = new CategoryEntity(categoryDTO);
        categoryRepository.create(categoryEntity);
        return categoryDTO;
    }

    @Override
    public CategoryDTO getById(int id) {
        return new CategoryDTO(categoryRepository.getById(id));
    }

    public int getByName(String name) {
        return categoryRepository.getByName(name);
    }

    @Override
    public List<CategoryDTO> getAll() {
        return null;
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
