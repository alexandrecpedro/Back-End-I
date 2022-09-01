package com.example.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentEntity {
    /** Attributes **/
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String studentCode, firstName, lastName;

    /** Constructor **/
    public StudentEntity() {
    }

    public StudentEntity(String studentCode, String firstName, String lastName) {
        this.studentCode = studentCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public StudentEntity(Long id, String studentCode, String firstName, String lastName) {
        this.id = id;
        this.studentCode = studentCode;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /** Getters/Setters **/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
