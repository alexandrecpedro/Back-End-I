package Pharmacy.medicine.dao.impl;

import Pharmacy.medicine.dao.SettingJDBC;
import Pharmacy.medicine.dao.IDao;
import Pharmacy.medicine.model.Medicine;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MedicineDaoH2 implements IDao<Medicine> {
    /** Attribute **/
    private SettingJDBC settingJDBC;
    
    /** Constructor **/
    public MedicineDaoH2(SettingJDBC settingJDBC) {
        this.settingJDBC = settingJDBC;
    }

    /** Methods **/
    @Override
    public Medicine save(Medicine medicine) {
        Connection connection = settingJDBC.conectWithDatabase();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO MEDICINE" +
                        "(name, laboratory, quantity, price)" +
                        "VALUES ('%s', '%s', '%s', '%s')",
                medicine.getName(),
                medicine.getLaboratory(),
                medicine.getQuantity(),
                medicine.getPrice());

        try {
            statement = connection.createStatement();
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next())
                medicine.setId(keys.getLong(1));
            statement.close();
            connection.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return medicine;
    }

    @Override
    public Medicine findById(Long id) {
        Connection connection = settingJDBC.conectWithDatabase();
        Statement statement = null;
        String query = String.format("SELECT * FROM MEDICINE WHERE id = %s", id);

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()) {
                return instantiateMedicine(resultSet);
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Medicine> findAll() {
        Connection connection = settingJDBC.conectWithDatabase();
        Statement statement = null;
        String query = String.format("SELECT * FROM MEDICINE");
        List<Medicine> medicineList = new ArrayList<>();

        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                medicineList.add(instantiateMedicine(resultSet));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return medicineList;
    }

    @Override
    public void deleteById(Long id) {
        Connection connection = settingJDBC.conectWithDatabase();
        Statement statement = null;
        String query = String.format("DELETE FROM MEDICINE WHERE id = %s", id);
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Medicine medicine) {
        Connection connection = settingJDBC.conectWithDatabase();
        Statement statement = null;
        String query = String.format("UPDATE MEDICINE SET (name, laboratory, quantity, price) = " +
                        "('%s', '%s', '%s', '%s') WHERE id = %s",
                medicine.getName(), medicine.getLaboratory(), medicine.getQuantity(),
                medicine.getPrice(), medicine.getId());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Medicine instantiateMedicine(ResultSet resultSet) throws SQLException {
        Medicine medicine = new Medicine();
        medicine.setId(resultSet.getLong(1));
        medicine.setName(resultSet.getString(2));
        medicine.setLaboratory(resultSet.getString(3));
        medicine.setQuantity(resultSet.getInt(4));
        medicine.setPrice(resultSet.getDouble(5));

        return medicine;
    }
}
