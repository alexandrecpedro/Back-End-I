package HotelGroup.filial.dao.impl;

import HotelGroup.filial.dao.config.ConfiguracaoJDBC;
import HotelGroup.filial.dao.IDao;
import HotelGroup.filial.model.Filial;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilialDaoImpl implements IDao<Filial> {
    /** Attributes **/
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger LOGGER = Logger.getLogger(FilialDaoImpl.class);

    /** Constructor **/
    public FilialDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    /** Methods **/
    @Override
    public Filial salvar(Filial filial) {
        LOGGER.debug("Salvando filial... " + filial.toString());
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO filiais (nomeFilial, logradouro, numero, cidade, estado, e5Estrelas) " +
                        "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",
                filial.getNomeFilial(), filial.getLogradouro(), filial.getNumero(), filial.getCidade(),
                filial.getEstado(), filial.getE5Estrelas());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                filial.setId(resultSet.getInt(1));
            }
            LOGGER.info(String.format("Filial salva com o id: %s", filial.getId()));
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filial;
    }

    @Override
    public List<Filial> listar() {
        LOGGER.debug("Listando filiais...");
        Connection connection = configuracaoJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format("SELECT * FROM filiais");
        List<Filial> filiais = new ArrayList<>();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                filiais.add(new Filial(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5),
                        resultSet.getString(6),
                        resultSet.getBoolean(7)));
            }
            LOGGER.info(String.format("Foram encontradas %s filiais", filiais.size()));
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return filiais;
    }
}
