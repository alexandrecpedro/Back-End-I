package Bank;

import Bank.entities.User;
import org.apache.log4j.BasicConfigurator;

import java.sql.*;

public class Main {
    /** Queries **/
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS BANKUSER; CREATE TABLE BANKUSER "
            + "("
            +" Id INT PRIMARY KEY, "
            + " Name VARCHAR(100) NOT NULL, "
            + " Email VARCHAR(100) NOT NULL, "
            + " Balance numeric(15,2) NOT NULL "
            + ")";

    private static final String sqlInsert = "INSERT INTO BANKUSER (Id, Name, Email, Balance) " +
            "VALUES (?, ?, ?, ?)";

    private static final String sqlUpdate = "UPDATE BANKUSER SET Balance = ? WHERE Email = ?";

    /** Main Method **/
    public static void main(String[] args) throws Exception {
        // Configuring log4j.properties (Alternative)
        BasicConfigurator.configure();

        // Attribute
        User user = new User("Pedro", "pedro@dh.com.br", 10d);

        // Connection
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            PreparedStatement psInsert = connection.prepareStatement(sqlInsert);

            psInsert.setInt(1, 1);
            psInsert.setString(2, user.getName());
            psInsert.setString(3, user.getEmail());
            psInsert.setDouble(4, user.getBalance());

            psInsert.execute();

            connection.setAutoCommit(false);

            PreparedStatement psUpdate = connection.prepareStatement(sqlUpdate);
            psUpdate.setDouble(1, user.increaseBalance(10d));
            psUpdate.setString(2, user.getEmail());
            psUpdate.execute();
            // int a = 4/0;

            connection.commit();

            connection.setAutoCommit(true);

            String sqlSelect = "SELECT * FROM BANKUSER";
            Statement stSelect = connection.createStatement();
            ResultSet rs = stSelect.executeQuery(sqlSelect);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getString(3) + " | " +
                        rs.getDouble(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }

        //Connection connection1 = getConnection();
        //String sqlSelect = "SELECT * FROM BANKUSER";
        //Statement stSelect = connection1.createStatement();
        //ResultSet rs = stSelect.executeQuery(sqlSelect);
        //while (rs.next()) {
            //System.out.println(rs.getInt(1) + " | " +
                    //rs.getString(2) + " | " +
                    //rs.getString(3) + " | " +
                    //rs.getDouble(4));
        //}
    }

    /** Connection Method **/
    private static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:mem:class_13_consulting_transactions_db", "sa", "");
    }
}
