package com.example.ecommerce.repository;

import com.example.ecommerce.entity.CategoryEntity;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CategoryRepository {
    /** Attributes **/
    private static Map<Integer, CategoryEntity> categoryMap = new HashMap<>();
    private static int idCategory = 1;

    /** Methods **/
    public CategoryEntity create(CategoryEntity categoryEntity) {
        categoryEntity.setId(idCategory++);
        categoryMap.put(categoryEntity.getId(), categoryEntity);
        return categoryEntity;
    }

    public CategoryEntity getById(int id) {
        return categoryMap.get(id);
    }

    public int getByName(String name) {
        for (CategoryEntity categoryEntity : categoryMap.values()) {
            if (categoryEntity.getName().equalsIgnoreCase(name)) {
                return categoryEntity.getId();
            }
        }

        return 0;
    }

    public List<CategoryEntity> getAll() {
        return new ArrayList<>(categoryMap.values());
    }

    public String delete(int id) {
        categoryMap.remove(id);
        return "Deleted category";
    }

    public CategoryEntity update(CategoryEntity categoryEntity) {
        categoryMap.put(categoryEntity.getId(), categoryEntity);
        return categoryEntity;
    }
}
