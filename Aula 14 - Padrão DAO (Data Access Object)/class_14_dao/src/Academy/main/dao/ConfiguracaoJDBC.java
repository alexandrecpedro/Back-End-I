package Academy.main.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfiguracaoJDBC {
    /** Attributes **/
    private String jdbcDriver, dbUrl,nomeUsuario, senhaUsuario;
    private Connection connection;

    /** Constructor **/
    //Podemos usar este construtor para nos conectar com outra configuração
    public ConfiguracaoJDBC(String jdbcDriver, String dbUrl, String nomeUsuario, String senhaUsuario) {
        this.jdbcDriver = jdbcDriver;
        this.dbUrl = dbUrl;
        this.nomeUsuario = nomeUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public ConfiguracaoJDBC() {
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:Academy;DB_CLOSE_DELAY=1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.nomeUsuario = "sa";
        this.senhaUsuario = "";
    }

    /** Methods **/
    public Connection conectarComBancoDeDados() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(dbUrl, nomeUsuario, senhaUsuario);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return connection;
    }


}
