package DentistClinic.dao.impl;

import DentistClinic.dao.IDao;
import DentistClinic.dao.SettingJDBC;
import DentistClinic.model.Address;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressDaoH2 implements IDao<Address> {
    /** Attribute **/
    private SettingJDBC settingJDBC;

    /** Constructor **/
    public AddressDaoH2(SettingJDBC settingJDBC) {
        this.settingJDBC = settingJDBC;
    }

    /** Methods **/
    @Override
    public Address save(Address address) {
        Connection connection = settingJDBC.conectWithDatabase();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO addresses (street, houseNumber, city, neighborhood) " +
                        "VALUES ('%s', '%d', '%s', '%s')",
                address.getStreet(),
                address.getHouseNumber(),
                address.getCity(),
                address.getNeighborhood()
        );

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()) {
                address.setId(keys.getLong(1));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return address;
    }
}
