package Subjects.com.dh.subjects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SettingJDBC {
    /** Attributes **/
    private String jdbcDriver, dbUrl, userName, userPassword;
    private Connection connection;

    /** Constructor **/
    public SettingJDBC(String jdbcDriver, String dbUrl, String userName, String userPassword) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public SettingJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:subjects;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.userName = "sa";
        this.userPassword = "";
    }

    /** Method **/
    public Connection conectWithDatabase() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(dbUrl, userName, userPassword);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }
}
