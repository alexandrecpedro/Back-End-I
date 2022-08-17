package Employee.test;

import Employee.employee.dao.SettingJDBC;
import Employee.employee.dao.impl.EmployeeDaoImpl;
import Employee.employee.model.Employee;
import Employee.employee.service.EmployeeService;
import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeServiceTest {
    /** Attribute **/
    private EmployeeService employeeService = new EmployeeService(new EmployeeDaoImpl(new SettingJDBC()));
    
    /** Tests **/
    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void saveEmployeeTest() {
        Employee employee = new Employee("Thiago", "Bellini",
                "123.456.788-90", "96725-4321", "Teacher", true);
        employeeService.save(employee);
        assertEquals("Bellini", employee.getLastName());
    }
}