package com.example.school.repository;

import com.example.school.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
    /** Method **/
    @Query("SELECT student s FROM Student WHERE s.name = ?1")
    Optional<StudentModel> findStudentByName(String name);
}
