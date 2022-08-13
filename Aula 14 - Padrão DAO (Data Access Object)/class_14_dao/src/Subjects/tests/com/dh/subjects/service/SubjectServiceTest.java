package Subjects.tests.com.dh.subjects.service;

import Subjects.com.dh.subjects.dao.SettingJDBC;
import Subjects.com.dh.subjects.dao.impl.SubjectDaoH2;
import Subjects.com.dh.subjects.model.Subject;
import Subjects.com.dh.subjects.service.SubjectService;
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