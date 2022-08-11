package User;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    private static final Logger LOGGER = Logger.getLogger(User.class);
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS usuario;"
            + "CREATE TABLE usuario (" +
            "id INT PRIMARY KEY, " +
            "nome VARCHAR(32) NOT NULL, " +
            "sobrenome VARCHAR(64) NOT NULL, " +
            "idade INT NOT NULL)";
    private static final String SQL_INSERT1 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) VALUES " +
            "(1, 'John', 'Lennom', 50 ); ";

    private static final String SQL_INSERT2 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + " VALUES "
            + "(2, 'Marcio', 'Antunes', 24 ); ";

    private static final String SQL_INSERT3 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + " VALUES "
            + "(3, 'Gabriel', 'Silva', 37 ); ";

    private static final String SQL_INSERT4 = "INSERT INTO usuario "
            + "(id, nome, sobrenome, idade) "
            + " VALUES "
            + "(4, 'Ricardo', 'Gomes', 65 ); ";

    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id = 2";

    public static void main(String[] args) throws Exception {
        // Configuração padrão do Log4j
        BasicConfigurator.configure();

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            LOGGER.info("Criando o BD...");
            statement.execute(SQL_CREATE_TABLE);
            LOGGER.info("Inserindo os dados");
            statement.execute(SQL_INSERT1);
            statement.execute(SQL_INSERT2);
            statement.execute(SQL_INSERT3);
            statement.execute(SQL_INSERT4);

            LOGGER.info("Deletando os dados");
            statement.execute(SQL_DELETE);

            showUsers(connection);

            //deletaUsuario(connection);


        } catch (Exception e) {
            LOGGER.error("Erro na execução do bloco Try: ", e);

        } finally {
            if (connection != null) {
                connection.close();
            }
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:class_12_integrative_class", "sa", "");
    }

    public static void showUsers (Connection connection) throws Exception{
        LOGGER.info("Visualizando os dados ...");
        String sqlSelect = "SELECT * FROM usuario";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);

        while (rs.next()){
            System.out.println(rs.getInt(1)
                    + " | " + rs.getString(2)
                    + " | " + rs.getString(3)
                    + " | " + rs.getInt(4));
        }
    }

    public static void deletaUsuario(int id, Connection connection) throws Exception {
        LOGGER.info("Deletando dados...");
        String sqlDelete = "DELETE FROM usuario WHERE id=2";


//        try (PreparedStatement ps = connection.prepareStatement(sqlDelete)){
//            ps.setInt(2, id);
//            ps.execute();
//        } catch (Exception e){
//            LOGGER.error("Erro na execução do bloco TY (DELETE): ", e);
//        }

    }


}

// garbage collector = limpa memória do Java
