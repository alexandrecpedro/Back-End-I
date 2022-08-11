package Employee.dao.impl;

import Employee.dao.IDAO;
import Employee.database.Database;
import Employee.database.exceptions.DatabaseException;
import Employee.model.Employee;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoH2 implements IDAO<Employee> {
    /** Attributes **/
    private Connection connection;
    private final Logger logger = Logger.getLogger(EmployeeDaoH2.class);

    /** Constructor **/
    public EmployeeDaoH2() {
        this.connection = Database.getConnection();
    }

    /** Method **/
    @Override
    public void insert(Employee employee) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement("""
                    INSERT INTO employee (id, name, email)
                    VALUES
                    (?, ?, ?)
                    """);

            ps.setInt(1, employee.getId());
            ps.setString(2 , employee.getName());
            ps.setString(3 , employee.getEmail());

            int rows = ps.executeUpdate();
            System.out.println("ok");
        } catch (SQLException e) {
            logger.error(e.getMessage());
            e.printStackTrace();
        }
        finally {
            Database.closeStatement(ps);
            Database.closeResultSet(rs);
        }
    }

    @Override
    public void update(Employee employee) {
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement("""
                    UPDATE employee
                    SET name = ?, email = ?
                    WHERE id = ?
                    """);

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setInt(3, employee.getId());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new DatabaseException(e.getMessage());
        } finally {
            Database.closeStatement(ps);
        }
    }

    @Override
    public Employee findById(int id) {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement("""
                    SELECT * FROM employee
                    WHERE id = ?
                    """);

            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                return instantiateEmployee(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database.closeStatement(ps);
            Database.closeResultSet(rs);
        }

        return null;
    }

    @Override
    public List<Employee> findAll() {
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = connection.prepareStatement("""
                    SELECT * FROM employee
                    """);
            rs = ps.executeQuery();

            List<Employee> employees = new ArrayList<>();

            while (rs.next()){
                employees.add(instantiateEmployee(rs));
            }

            return employees;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database.closeStatement(ps);
            Database.closeResultSet(rs);
        }

        return null;
    }

    @Override
    public void delete(String field, Object o) {
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(String.format("""
                    DELETE FROM employee
                    WHERE %s = ?
                    """, field) );
            ps.setObject(1, o);
            int rows = ps.executeUpdate();
            if (rows == 0) {
                throw new DatabaseException("No id found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Database.closeStatement(ps);
        }
    }

    public Employee instantiateEmployee(ResultSet rs) throws SQLException {
        Employee employee = new Employee();
        employee.setId(rs.getInt("id"));
        employee.setName(rs.getString("name"));
        employee.setEmail(rs.getString("email"));

        return employee;
    }
}
