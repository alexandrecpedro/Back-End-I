package com.dh.service;

import com.dh.subjects.dao.SettingJDBC;
import com.dh.subjects.dao.impl.SubjectDaoH2;
import com.dh.subjects.model.Subject;
import com.dh.subjects.service.SubjectService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubjectServiceTest {
    /** Attribute **/
    private SubjectService subjectService = new SubjectService(new SubjectDaoH2(new SettingJDBC()));

    /** Tests **/
    @Test
    public void saveSubjectTest() {
        Subject subject = new Subject("Backend");
        Subject registeredSubject = subjectService.save(subject);
        assertTrue(registeredSubject.getId() != null);
    }

    @Test
    public void findAllTest() {
        Subject subject = new Subject("Backend");
        subjectService.save(subject);

        List<Subject> subjects = subjectService.findAll();
        assertEquals(1, subjects.size());
    }

}