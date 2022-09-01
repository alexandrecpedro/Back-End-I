package com.example.school.service;

import com.example.school.model.StudentModel;
import com.example.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    /** Attribute **/
    private StudentRepository studentRepository;

    /** Constructor **/
    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /** Method **/
    public List<StudentModel> findAll() {
        return studentRepository.findAll();
    }

    public StudentModel findByName(String name) {
        return studentRepository.findStudentByName(name).get();
    }
}
