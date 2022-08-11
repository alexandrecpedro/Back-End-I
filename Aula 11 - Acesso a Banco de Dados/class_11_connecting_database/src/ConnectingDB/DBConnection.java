package ConnectingDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    public static void main(String[] args) throws Exception {
        /** Instantiating **/
        Class.forName("org.h2.Driver").newInstance();

        /** Connecting with H2 Database **/
        Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        Statement statement = connection.createStatement();

        /** Queries **/
        // Create Table
        String sqlCreateTable = "DROP TABLE IF EXISTS Test;" +
                "CREATE TABLE Test(" +
                "Id INT AUTO_INCREMENT PRIMARY KEY, " +
                "Name VARCHAR(255))";
        statement.execute(sqlCreateTable);

        // Insert
        String sqlInsert1 = "INSERT INTO Test(Name) VALUES ('Hello');";
        String sqlInsert2 = "INSERT INTO Test(Name) VALUES ('World');";
        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);

        // Read Table content
        String sqlRead = "SELECT * FROM Test";
        ResultSet resultSet = statement.executeQuery(sqlRead);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) +
                    " | " + resultSet.getString(2));
        };
    }
}
