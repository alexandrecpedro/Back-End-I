package com.example.student.repository;

import com.example.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<StudentEntity, Long> {
    /** Methods **/
}
