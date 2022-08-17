package Employee.employee.service;

import Employee.employee.model.Employee;
import Employee.employee.dao.IDao;

public class EmployeeService {
    /** Attribute **/
    private IDao<Employee> employeeIDao;

    /** Constructor **/
    public EmployeeService(IDao<Employee> employeeIDao) {
        this.employeeIDao = employeeIDao;
    }

    /** Method **/
    public Employee save(Employee employee) {
        return employeeIDao.save(employee);
    }
}
