package com.example.medicine.dao.impl;

import com.example.medicine.dao.IDao;
import com.example.medicine.dao.SettingJDBC;
import com.example.medicine.model.Medicine;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicineDaoImpl implements IDao<Medicine> {
    /** Attributes **/
    private SettingJDBC settingJDBC;

    /** Constructor **/
    public MedicineDaoImpl(SettingJDBC settingJDBC) {
        this.settingJDBC = settingJDBC;
    }

    /** Methods **/
    @Override
    public Medicine save(Medicine medicine) {
        Connection connection = settingJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format("INSERT INTO medicines (name, laboratory, quantity, price) " +
                        "VALUES ('%s', '%s', '%s', '%s')",
                medicine.getName(), medicine.getLaboratory(), medicine.getQuantity(),
                medicine.getPrice());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                medicine.setId(resultSet.getInt(1));

            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return medicine;
    }

    @Override
    public Medicine findById(Integer id) {
        Connection connection = settingJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format("SELECT * FROM medicines WHERE id = '%S'", id);
        Medicine medicine = new Medicine();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                medicine.setId(resultSet.getInt("id"));
                medicine.setName(resultSet.getString("name"));
                medicine.setLaboratory(resultSet.getString("laboratory"));
                medicine.setQuantity(resultSet.getInt("quantity"));
                medicine.setPrice(resultSet.getDouble("price"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return medicine;
    }
}
