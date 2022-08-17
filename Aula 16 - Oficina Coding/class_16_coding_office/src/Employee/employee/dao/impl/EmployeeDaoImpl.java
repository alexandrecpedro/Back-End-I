package Employee.employee.dao.impl;

import Employee.employee.dao.IDao;
import Employee.employee.dao.SettingJDBC;
import Employee.employee.model.Employee;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImpl implements IDao<Employee> {
    /** Attributes **/
    final static Logger LOGGER = Logger.getLogger(EmployeeDaoImpl.class);
    private SettingJDBC settingJDBC;

    /** Constructor **/
    public EmployeeDaoImpl(SettingJDBC settingJDBC) {
        this.settingJDBC = settingJDBC;
    }

    /** Methods **/
    @Override
    public Employee save(Employee employee) {
        LOGGER.debug("Saving employee: " + employee.toString());
        Connection connection = settingJDBC.connectWithDatabase();
        Statement statement = null;
        String query = String.format(
                "INSERT INTO employees (firstName, lastName, cpf, phone, position, access) " +
                        "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",
                employee.getFirstName(), employee.getLastName(), employee.getCpf(),
                employee.getPhone(), employee.getPosition(), employee.getAccess());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                employee.setId(resultSet.getInt(1));
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }
}
