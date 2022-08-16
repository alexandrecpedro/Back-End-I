package Dentist.service;

import BankAccount.model.BankAccount;
import Dentist.model.Dentist;
import org.apache.log4j.BasicConfigurator;

import java.sql.*;

public class DentistService {
    /** Queries - SQL Database **/
    private static final String SQL_CREATE_TABLE = """
            DROP TABLE IF EXISTS dentist;
            
            CREATE TABLE dentist (
            id INT PRIMARY KEY,
            firstName VARCHAR(64) NOT NULL,
            lastName VARCHAR(64) NOT NULL,
            enrollment INT
            );
            """;

    private static final String SQL_UPDATE = """
            UPDATE dentist SET enrollment = ?
            WHERE id = ?
            """;

    private static final String SQL_INSERT = """
            INSERT INTO dentist (id, firstName, lastName, enrollment)
            VALUES (?, ?, ?, ?)
            """;

    /** Methods **/
    // Main Method
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        Connection connection = null;
        Dentist dentist = new Dentist("Bill", "Gates",
                1234567890L);

        try {
            connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_CREATE_TABLE);
            preparedStatement.executeUpdate();

            // Insert data at DB
            insertDentist(connection, dentist);
            showDentistData(connection);

            // Update Account
            updateDentistEnrollment(connection, 6528761L);
            showDentistData(connection);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    // InsertDentist Method
    public static void insertDentist(Connection connection, Dentist dentist)
            throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
        preparedStatement.setLong(1, 1);
        preparedStatement.setString(2, dentist.getFirstName());
        preparedStatement.setString(3, dentist.getLastName());
        preparedStatement.setLong(4, dentist.getEnrollment());
        //LOGGER.info("Inserting account at Database");
        preparedStatement.execute();
    }

    // UpdateDentistEnrollment Method
    public static void updateDentistEnrollment(Connection connection,
                                                Long value) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE);
        preparedStatement.setLong(1, value);
        preparedStatement.setLong(2, 1);
        preparedStatement.execute();
    }

    // ShowBankAccountData Method
    public static void showDentistData(Connection connection) throws Exception {
        String sqlSelect = "SELECT * FROM dentist";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);

        while (rs.next()) {
            System.out.println("ID: " + rs.getLong("id") +
                    "\nFirst Name: " + rs.getString("firstName") +
                    "\nLast Name: " + rs.getString("lastName") +
                    "\nEnrollment: " + rs.getLong("enrollment"));
        }
    }


    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:mem:class_13_consulting_transactions_db",
                "sa", "");
    }
}
