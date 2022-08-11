package TableOfShapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Shapes {
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS shape; " +
            "CREATE TABLE shape (" +
            "id int auto_increment PRIMARY KEY, " +
            "type varchar(50) not null, " +
            "color varchar(50) not null);";

    private static final String INSERT_CIRCLE_RED = "INSERT INTO shape (" +
            "type, color) VALUES ('circle', 'red');";

    private static final String INSERT_CIRCLE_BLUE = "INSERT INTO shape (" +
            "type, color) VALUES ('circle', 'blue');";

    private static final String INSERT_SQUARE_RED = "INSERT INTO shape (" +
            "type, color) VALUES ('square', 'red');";

    private static final String INSERT_SQUARE_PURPLE = "INSERT INTO shape (" +
            "type, color) VALUES ('square', 'purple');";

    private static final String INSERT_SQUARE_YELLOW = "INSERT INTO shape (" +
            "type, color) VALUES ('square', 'yellow');";

    public static void main(String[] args) throws Exception {

        Connection conn = null;

        try {
            conn = getConnection();
            Statement createTable = conn.createStatement();
            createTable.execute(SQL_CREATE_TABLE);

            Statement circleRed = conn.createStatement();
            circleRed.execute(INSERT_CIRCLE_RED);

            Statement circleBlue = conn.createStatement();
            circleBlue.execute(INSERT_CIRCLE_BLUE);

            Statement squareRed = conn.createStatement();
            squareRed.execute(INSERT_SQUARE_RED);

            Statement squarePurple = conn.createStatement();
            squarePurple.execute(INSERT_SQUARE_PURPLE);

            Statement squareYellow = conn.createStatement();
            squareYellow.execute(INSERT_SQUARE_YELLOW);

            String SELECT_CIRCLE_RED = "SELECT * FROM shape WHERE type = 'circle' AND color = 'red';";
            Statement selectCircleRed = conn.createStatement();
            ResultSet rs = selectCircleRed.executeQuery(SELECT_CIRCLE_RED);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " +
                        rs.getString(2) + " | " +
                        rs.getString(3));
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            conn.close();
        }

    }

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:h2:mem:class_11_connecting_database", "sa", "");
    }
}
