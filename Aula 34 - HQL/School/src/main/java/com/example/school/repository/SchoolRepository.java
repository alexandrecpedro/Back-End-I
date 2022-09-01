package com.example.school.repository;

import com.example.school.model.SchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SchoolRepository extends JpaRepository<SchoolModel, Long> {
    /** Method **/
    @Query("SELECT school s FROM School WHERE s.directory = ?1")
    Optional<SchoolModel> findSchoolByDirectory(String directory);
}
