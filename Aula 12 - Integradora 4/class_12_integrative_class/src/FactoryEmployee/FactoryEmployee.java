package FactoryEmployee;

import User.User;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FactoryEmployee {
    private static final Logger LOGGER = Logger.getLogger(User.class);
    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS employee;"
            + "CREATE TABLE employee (" +
            "id INT PRIMARY KEY, " +
            "name VARCHAR(62), " +
            "email VARCHAR(62));";

    private static final String SQL_INSERT1 = "INSERT INTO employee "
            + "(id, name, email) VALUES " +
            "(1, 'John', 'j@lennom.com'); ";

    private static final String SQL_INSERT2 = "INSERT INTO employee "
            + "(id, name, email) VALUES "
            + "(2, 'Marcio', 'm@antunes.br'); ";

    private static final String SQL_INSERT3 = "INSERT INTO employee "
            + "(id, name, email) VALUES "
            + "(3, 'Gabriel', 'gsilva@yahoo.com'); ";

    private static final String SQL_INSERT4 = "INSERT INTO employee "
            + "(id, name, email) VALUES "
            + "(3, 'Ricardo', 'r_gomes@gmil.br'); ";

    private static final String SQL_INSERT5 = "INSERT INTO employee "
            + "(id, name, email) VALUES "
            + "(4, 'Ricardo', 'r_gomes@gmil.br'); ";

    private static final String SQL_UPDATE = "UPDATE employee SET email = 'r_gomes@gmail.com' WHERE id = 4";

    private static final String SQL_DELETE1 = "DELETE FROM employee WHERE id = 2";

    private static final String SQL_DELETE2 = "DELETE FROM employee WHERE name = 'Ricardo'";

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

            showUsers(connection);
            System.out.println();

            LOGGER.info("Deletando os dados");
            statement.execute(SQL_DELETE1);

            showUsers(connection);

        } catch (JdbcSQLIntegrityConstraintViolationException error) {
            LOGGER.error("Duplicated primary key \n");

//        } catch (Exception e) {
//            LOGGER.error("Erro na execução do bloco Try: ", e);
        } finally {
            Statement statement = connection.createStatement();
            LOGGER.info("Inserindo os dados");
            statement.execute(SQL_INSERT5);

//            showUsers(connection);
//            System.out.println();

            LOGGER.debug("Atualizando os dados do funcionário 4");
            statement.execute(SQL_UPDATE);

//            showUsers(connection);
//            System.out.println();

            LOGGER.info("Deletando o funcionário 2");
            statement.execute(SQL_DELETE1);

//            showUsers(connection);
//            System.out.println();

            LOGGER.info("Deletando o funcionário 4");
            statement.execute(SQL_DELETE2);

//            showUsers(connection);

            if (connection != null) {
                connection.close();
            }
        }

    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:mem:class_12_integrative_class", "sa", "");
    }

    public static void showUsers (Connection connection) throws Exception {
        LOGGER.info("Visualizando os dados ...");
        String sqlSelect = "SELECT * FROM employee";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlSelect);

        while (rs.next()){
            System.out.println(rs.getInt(1)
                    + " | " + rs.getString(2)
                    + " | " + rs.getString(3)
                    + " | " + rs.getInt(4));
        }
    }
}
