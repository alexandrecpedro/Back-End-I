package com.example.student.service.impl;

import com.example.student.entity.StudentEntity;
import com.example.student.repository.IStudentRepository;
import com.example.student.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService<StudentEntity> {
    /** Attribute **/
    private final IStudentRepository studentRepository;

    /** Constructor **/
    public StudentServiceImpl(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /** Methods **/
    @Override
    public List<StudentEntity> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<StudentEntity> findStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public StudentEntity addStudent(StudentEntity studentEntity) {
        return (!studentEntity.equals(null)) ?
                studentRepository.save(studentEntity)
                : new StudentEntity();
    }

    @Override
    public String deleteStudent(Long id) {
        if (studentRepository.findById(id).isPresent()) {
            studentRepository.deleteById(id);
            return "Deleted student";
        }
        return "Student not found";
    }

    @Override
    public String updateStudent(StudentEntity studentEntity) {
        if (!studentEntity.equals(null) && studentRepository.findById(studentEntity.getId()).isPresent()) {
            studentRepository.saveAndFlush(studentEntity);
            return "Updated student";
        }
        return "It was not possible to update student!";
    }
}
