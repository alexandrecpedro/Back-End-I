package Employee.service;

import Employee.dao.IDAO;
import Employee.model.Employee;

import java.util.List;

public class EmployeeService {
    /** Attribute **/
    private IDAO<Employee> employeeIDAO;

    /** Constructor **/
    public EmployeeService(IDAO<Employee> employeeIDAO) {
        this.employeeIDAO = employeeIDAO;
    }

    /** Methods **/
    public void insert(Employee employee) {
        employeeIDAO.insert(employee);
    }

    public void update(Employee employee) {
        employeeIDAO.update(employee);
    }

    public void delete(String field, Object o) {
        employeeIDAO.delete(field, o);
    }

    public Employee findById(int id) {
        return employeeIDAO.findById(id);
    }

    public List<Employee> findAll() {
        return employeeIDAO.findAll();
    }
}
