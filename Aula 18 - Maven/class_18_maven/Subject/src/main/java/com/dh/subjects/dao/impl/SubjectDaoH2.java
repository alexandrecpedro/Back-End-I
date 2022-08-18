package com.dh.subjects.dao.impl;

import com.dh.subjects.dao.IDao;
import com.dh.subjects.dao.SettingJDBC;
import com.dh.subjects.model.Subject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SubjectDaoH2 implements IDao<Subject> {
    /** Attributes **/
    private SettingJDBC settingJDBC;

    /** Constructor **/
    public SubjectDaoH2(SettingJDBC settingJDBC) {
        this.settingJDBC = settingJDBC;
    }

    /** Methods **/
    @Override
    public Subject save(Subject subject) {
        Connection connection = settingJDBC.conectWithDatabase();
        Statement statement = null;
        String query = String.format("INSERT INTO subjects(firstName) VALUES('%s')", subject.getFirstName());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()) {
                subject.setId(keys.getInt(1));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subject;
    }

    @Override
    public List<Subject> findAll() {
        Connection connection = settingJDBC.conectWithDatabase();
        Statement statement = null;
        String query = String.format("SELECT * FROM subjects");
        List<Subject> subjects = new ArrayList<>();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                subjects.add(new Subject(resultSet.getInt("id"),
                        resultSet.getString("firstName")));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return subjects;
    }
}
