package DentistClinic.clinic.dao.impl;

import DentistClinic.clinic.dao.ConfiguracaoJDBC;
import DentistClinic.clinic.dao.IDao;
import DentistClinic.clinic.model.Paciente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PacienteDaoImpl implements IDao<Paciente> {
    /** Attribute **/
    private ConfiguracaoJDBC configuracaoJDBC;

    /** Constructor **/
    public PacienteDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    /** Methods **/
    @Override
    public Paciente salvar(Paciente paciente) {
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO pacientes (nome, sobrenome, rg, dataCadastro, idEndereco) " +
                        "VALUES ('%s', '%s', '%s', '%s', '%s')",
                paciente.getNome(), paciente.getSobrenome(), paciente.getRg(),
                paciente.getDataCadastro(), paciente.getIdEndereco());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                paciente.setId(resultSet.getInt(1));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public List<Paciente> buscarTodos() {
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format("SELECT * FROM pacientes");
        List<Paciente> pacientes = new ArrayList<>();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                pacientes.add(new Paciente(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getDate(5),
                        resultSet.getInt(6)));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pacientes;
    }

    @Override
    public void excluir(Integer id) {
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format("DELETE FROM pacientes WHERE id = %d", id);

        try {
            statement = connection.createStatement();
            statement.execute(query);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Paciente modificar(Paciente paciente) {
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format("UPDATE pacientes SET nome='%s', sobrenome='%s', rg='%s'," +
                "idEndereco='%s' WHERE id='%s'", paciente.getNome(), paciente.getSobrenome(),
                paciente.getRg(),paciente.getIdEndereco(),paciente.getId());

        try {
            statement = connection.createStatement();
            statement.execute(query);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return paciente;
    }
}
