package Subjects.com.dh.subjects.dao.impl;

import Subjects.com.dh.subjects.dao.IDao;
import Subjects.com.dh.subjects.dao.SettingJDBC;
import Subjects.com.dh.subjects.model.Subject;

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
        String query = String.format("INSERT INTO SUBJECTS(name) VALUES('%S')", subject.getName());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()) {
                subject.setId(keys.getInt(1));
            }
            statement.close();
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
        String query = String.format("SELECT * FROM SUBJECTS");
        List<Subject> subjects = new ArrayList<>();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                subjects.add(new Subject(resultSet.getInt("id"),
                        resultSet.getString("name")));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return subjects;
    }
}
