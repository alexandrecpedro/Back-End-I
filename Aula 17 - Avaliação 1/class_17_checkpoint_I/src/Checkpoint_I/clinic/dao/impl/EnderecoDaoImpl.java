package Checkpoint_I.clinic.dao.impl;

import DentistClinic.clinic.dao.ConfiguracaoJDBC;
import DentistClinic.clinic.dao.IDao;
import DentistClinic.clinic.model.Endereco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDaoImpl implements IDao<Endereco> {
    /** Attribute **/
    private ConfiguracaoJDBC configuracaoJDBC;

    /** Constructor **/
    public EnderecoDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    /** Methods **/
    @Override
    public Endereco salvar(Endereco endereco) {
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO enderecos (rua, numero, cidade, bairro) VALUES ('%s', '%d', '%s', '%s')",
                endereco.getRua(), endereco.getNumero(), endereco.getCidade(), endereco.getBairro());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                endereco.setId(resultSet.getInt(1));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return endereco;
    }

    @Override
    public List<Endereco> buscarTodos() {
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format("SELECT * FROM enderecos");
        List<Endereco> enderecos = new ArrayList<>();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                enderecos.add(new Endereco(resultSet.getInt("id"),
                        resultSet.getString("rua"),
                        resultSet.getInt("numero"),
                        resultSet.getString("cidade"),
                        resultSet.getString("bairro")));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return enderecos;
    }

    @Override
    public Endereco excluir(Endereco endereco) {
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format("DELETE FROM enderecos WHERE id = %d", endereco.getId());

        try {
            statement = connection.createStatement();
            statement.execute(query);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Endereco modificar(Endereco endereco, String rua) {
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format("UPDATE enderecos SET rua = %s WHERE id = %d", rua, endereco.getId());

        try {
            statement = connection.createStatement();
            statement.execute(query);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
