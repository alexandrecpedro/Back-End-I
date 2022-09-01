package com.example.student.service;

import java.util.List;
import java.util.Optional;

public interface IStudentService<T> {
    /** Methods **/
    List<T> findAllStudents();
    Optional<T> findStudentById(Long id);
    T addStudent(T t);
    String deleteStudent(Long id);
    String updateStudent(T t);
}
