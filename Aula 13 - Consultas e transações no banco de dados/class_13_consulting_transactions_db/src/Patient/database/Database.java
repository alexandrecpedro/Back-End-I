package Patient.database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Database {
    /** Attribute **/
    private static Connection connection = null;

    /** Methods **/
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                connection = DriverManager.getConnection(url, props);

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("database.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    // fecha as conexões para liberar a memória.
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            }
            catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    }

    // Close operations to avoid using unnecessary memory
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DatabaseException(e.getMessage());
            }
        }
    }
}
