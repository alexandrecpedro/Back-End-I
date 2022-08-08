package Animals;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Animals {
    /** Attributes **/
    private static final Logger LOGGER = Logger.getLogger(Animals.class);

    /** Queries - SQL Database **/
    private static final String SQLCREATETABLE = "DROP TABLE IF EXISTS animal; "
            + "CREATE TABLE animal ("
            + "id INT AUTO_INCREMENT PRIMARY KEY, "
            + "name VARCHAR(32) NOT NULL, "
            + "type VARCHAR(32) NOT NULL)";

    private static final String SQLINSERT1 = "INSERT INTO animal "
            + "(name, type) VALUES ('Poochy', 'dog')";

    private static final String SQLINSERT2 = "INSERT INTO animal "
            + "(name, type) VALUES ('Yoshi', 'dinosaur')";

    private static final String SQLINSERT3 = "INSERT INTO animal "
            + "(name, type) VALUES ('Epona', 'horse')";

    private static final String SQLINSERT4 = "INSERT INTO animal "
            + "(name, type) VALUES ('Koopa', 'turtle')";

    private static final String SQLINSERT5 = "INSERT INTO animal "
            + "(name, type) VALUES ('Paratroopa', 'turtle')";

    /** Class Main **/
    public static void main(String[] args) throws Exception {

        BasicConfigurator.configure();
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            LOGGER.info("Creating database ...");
            statement.execute(SQLCREATETABLE);
            LOGGER.info("Inserting data ...");
            statement.execute(SQLINSERT1);
            statement.execute(SQLINSERT2);
            statement.execute(SQLINSERT3);
            statement.execute(SQLINSERT4);
            statement.execute(SQLINSERT5);
            showAnimals(connection);
            deleteById(3, connection);
            showAnimals(connection);
        }
        catch (Exception e) {
            LOGGER.error("Error while executing try block: " + e);
        }
        finally {
            connection.close();
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:class_11_connecting_database", "sa", "");
    }

    public static void showAnimals(Connection connection) throws Exception {
        String sqlSelect = "SELECT * FROM animal";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);
        LOGGER.info("Viewing data ...");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " | "
                    + rs.getString(2) + " | "
                    + rs.getString(3));
        }
    }

    public static void deleteById(int id, Connection connection) throws Exception {
        String sqlDelete = "DELETE FROM animal WHERE id = " + id;
        Statement statement = connection.createStatement();
        LOGGER.info("Deleting animal with id " + id + " ...");
        statement.execute(sqlDelete);
    }

}