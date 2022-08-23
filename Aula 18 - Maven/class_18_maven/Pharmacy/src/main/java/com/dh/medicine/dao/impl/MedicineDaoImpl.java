package com.dh.medicine.dao.impl;

import com.dh.medicine.dao.IDao;
import com.dh.medicine.dao.SettingJDBC;
import com.dh.medicine.model.Medicine;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicineDaoImpl implements IDao<Medicine> {
    /** Attributes **/
    private SettingJDBC settingJDBC;
    final static Logger logger = Logger.getLogger(MedicineDaoImpl.class);
    
    /** Constructor **/
    public MedicineDaoImpl(SettingJDBC settingJDBC) {
        this.settingJDBC = settingJDBC;
    }

    /** Methods **/
    @Override
    public Medicine save(Medicine medicine) {
        logger.debug("Saving a new medicine: " + medicine.toString());
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
}
