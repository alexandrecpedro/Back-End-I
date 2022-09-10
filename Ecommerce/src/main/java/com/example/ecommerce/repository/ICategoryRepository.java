package com.example.ecommerce.repository;

import com.example.ecommerce.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<CategoryEntity, Integer> {
    /** Methods **/
    // Hibernate - very small search
    CategoryEntity findByName(String name);

    // HQL
    @Query("FROM CategoryEntity c WHERE c.name = :name")
    CategoryEntity getByName(String name);

    // SQL Native - complex searches
    @Query(value = "SELECT * FROM Categories c WHERE c.name = :name", nativeQuery = true)
    CategoryEntity getByNameSQL(String name);
}
