package com.example.student.controller;

import com.example.student.entity.StudentEntity;
import com.example.student.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    /** Attribute **/
    @Autowired
    private final StudentServiceImpl studentService;

    /** Constructor **/
    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    /** Methods **/
    @GetMapping(produces = "application/json")
    public List<StudentEntity> findAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<StudentEntity> findStudentById(@PathVariable Long id) {
        return studentService.findStudentById(id);
    }

    @PostMapping("/add")
    public StudentEntity addStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.addStudent(studentEntity);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody StudentEntity studentEntity) {
        return studentService.updateStudent(studentEntity);
    }

}
