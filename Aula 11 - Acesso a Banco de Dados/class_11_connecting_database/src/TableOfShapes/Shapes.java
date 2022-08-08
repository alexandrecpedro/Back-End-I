package TableOfShapes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Shapes {
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS figura; " +
            "CREATE TABLE figura (" +
            "id int PRIMARY KEY, " +
            "tipo varchar(50) not null, " +
            "cor varchar(50) not null);";

    private static final String INSERT_CIRC_VERM = "INSERT INTO figura (id, " +
            "tipo, cor) VALUES (1, 'circulo', 'vermelho');";

    private static final String INSERT_CIRC_AZUL = "INSERT INTO figura (id, " +
            "tipo, cor) VALUES (2, 'circulo', 'azul');";

    private static final String INSERT_QUAD_VERM = "INSERT INTO figura (id, " +
            "tipo, cor) VALUES (3, 'quadrado', 'vermelho');";

    private static final String INSERT_QUAD_ROXO = "INSERT INTO figura (id, " +
            "tipo, cor) VALUES (4, 'quadrado', 'roxo');";

    private static final String INSERT_QUAD_AMAR = "INSERT INTO figura (id, " +
            "tipo, cor) VALUES (5, 'quadrado', 'amarelo');";

    public static void main(String[] args) throws Exception {

        Connection conn = null;

        try {
            conn = getConnection();
            Statement createTable = conn.createStatement();
            createTable.execute(SQL_CREATE_TABLE);

            Statement circVerm = conn.createStatement();
            circVerm.execute(INSERT_CIRC_VERM);

            Statement circAzul = conn.createStatement();
            circAzul.execute(INSERT_CIRC_AZUL);

            Statement quadVerm = conn.createStatement();
            quadVerm.execute(INSERT_QUAD_VERM);

            Statement quadRoxo = conn.createStatement();
            quadRoxo.execute(INSERT_QUAD_ROXO);

            Statement quadAmar = conn.createStatement();
            quadAmar.execute(INSERT_QUAD_AMAR);

            String SELECT_CIRC_VERM = "SELECT * FROM figura WHERE tipo = 'circulo' AND cor = 'vermelho';";
            Statement selectCircVerm = conn.createStatement();
            ResultSet rs = selectCircVerm.executeQuery(SELECT_CIRC_VERM);

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
