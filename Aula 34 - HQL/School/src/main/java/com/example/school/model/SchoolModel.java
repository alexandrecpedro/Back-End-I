package com.example.school.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "School")
public class SchoolModel {
    /** Attributes **/
    @Id
    @SequenceGenerator(name = "school_sequence", sequenceName = "school_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_generator")
    private Long id;
    private String name, directory;
    @OneToMany(mappedBy = "schoolModel", fetch = FetchType.LAZY)
    private Set<StudentModel> students = new HashSet<>();

    /** Constructor **/
    public SchoolModel() {
    }

    public SchoolModel(String name, String directory, Set<StudentModel> students) {
        this.name = name;
        this.directory = directory;
        this.students = students;
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

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public Set<StudentModel> getStudents() {
        return students;
    }

    public void setStudents(Set<StudentModel> students) {
        this.students = students;
    }
}
