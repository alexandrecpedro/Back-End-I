package com.example.school.model;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class StudentModel {
    /** Attributes **/
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String name;
    private int age;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "school_id")
    private SchoolModel schoolModel;

    /** Constructor **/
    public StudentModel() {
    }

    public StudentModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /** Getters/Setters **/
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SchoolModel getSchoolModel() {
        return schoolModel;
    }

    public void setSchoolModel(SchoolModel schoolModel) {
        this.schoolModel = schoolModel;
    }
}
