package com.dh.subjects.service;

import com.dh.subjects.dao.IDao;
import com.dh.subjects.model.Subject;

import java.util.List;
public class SubjectService {
    /** Attributes **/
    private IDao<Subject> subjectIDao;

    /** Constructor **/
    public SubjectService(IDao<Subject> subjectIDao) {
        this.subjectIDao = subjectIDao;
    }

    /** Methods **/
    public Subject save(Subject subject) {
        return subjectIDao.save(subject);
    }

    public List<Subject> findAll() {
        return subjectIDao.findAll();
    }
}
