package Airplane.main.dao.impl;

import Airplane.main.dao.IDao;
import Airplane.main.dao.SettingJDBC;
import Airplane.main.model.Airplane;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AirplaneDaoH2 implements IDao<Airplane> {
    /** Attributes **/
    private SettingJDBC settingJDBC;
    private Connection connection;

    /** Constructor  **/
    public AirplaneDaoH2(SettingJDBC settingJDBC) {
        this.settingJDBC = settingJDBC;
        this.connection = settingJDBC.conectWithDatabase();
    }

    /** Methods
     * @return**/
    @Override
    public Airplane insert(Airplane obj) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement("""
                    INSERT INTO AIRPLANE (id, brand, model, registration, dateEntryIntoService)
                    VALUES (?, ?, ?, ?, ?)
                    """);

            preparedStatement.setInt(1, obj.getId());
            preparedStatement.setString(2, obj.getBrand());
            preparedStatement.setString(3, obj.getModel());
            preparedStatement.setInt(4, obj.getRegistration());
            preparedStatement.setDate(5, new java.sql.Date(obj.getDateEntryIntoservice().getTime()));

            int rowsAffect = preparedStatement.executeUpdate();

            System.out.println(rowsAffect);

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return obj;
    }

    @Override
    public void deleteById(Integer id) {
        PreparedStatement preparedStatement = null;
        String query = String.format("DELETE FROM AIRPLANE where id = %s", id);
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            int rows = preparedStatement.executeUpdate();
            System.out.println(rows);

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Airplane findById(Integer id) {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Airplane airplane = null;
        String query = String.format("SELECT * FROM AIRPLANE where ID = '%s'", id);
        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery(query);
            while (resultSet.next()) {
                airplane = instantiateAirplane(resultSet);
            }

            preparedStatement.close();
            resultSet.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return airplane;
    }

    @Override
    public List<Airplane> findAll() {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String query = String.format("SELECT * FROM AIRPLANE");
        List<Airplane> airplanes = new ArrayList<>();

        try {
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery(query);

            while (resultSet.next()) {
                airplanes.add(instantiateAirplane(resultSet));
            }

            preparedStatement.close();
            resultSet.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return airplanes;
    }

    public Airplane instantiateAirplane(ResultSet resultSet) throws SQLException {
        Airplane airplane = new Airplane(
                resultSet.getInt("id"),
                resultSet.getString("brand"),
                resultSet.getString("model"),
                resultSet.getInt("registration"),
                resultSet.getDate("dateEntryIntoService")
        );
        return airplane;
    }
}
