package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS employee; " +
            "CREATE TABLE employee (" +
            "id int auto_increment PRIMARY KEY, " +
            "name varchar(64) not null, " +
            "company varchar(64), " +
            "age int not null, " +
            "start_date varchar(32) not null);";

    private static final String SQL_INSERT1 = "INSERT INTO employee (" +
            "name, company, age, start_date) VALUES " +
            "('Murilo', 'Digital House', 28, '08/03/2022');";

    private static final String SQL_INSERT2 = "INSERT INTO employee (" +
            "name, company, age, start_date) VALUES " +
            "('Carolina', 'Digital House', 39, '28/01/2022');";

    private static final String SQL_INSERT3 = "INSERT INTO employee (" +
            "name, company, age, start_date) VALUES " +
            "('Diego', 'Digital House', 58, '11/08/2001');";

    public static void main(String[] args) throws Exception {

        // Application execution
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            Statement stateInsert1 = connection.createStatement();
            stateInsert1.execute(SQL_INSERT1);

            Statement stateInsert2 = connection.createStatement();
            stateInsert2.execute(SQL_INSERT2);

            Statement stateInsert3 = connection.createStatement();
            stateInsert3.execute(SQL_INSERT3);

            String sqlConsult = "SELECT * FROM employee";
            Statement selectEmployee = connection.createStatement();
            ResultSet rs = selectEmployee.executeQuery(sqlConsult);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getString(3) + " | " +
                        rs.getInt(4) + " | " +
                        rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }

    }

    // Out of Main method
    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:h2:mem:class_11_connecting_database", "sa", "");
    }

}
