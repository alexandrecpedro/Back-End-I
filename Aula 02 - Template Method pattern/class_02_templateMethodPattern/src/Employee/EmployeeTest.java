package Employee;

import org.junit.jupiter.api.Test;

class EmployeeTest {

    @Test
    void Calculus() {
        // Effective Employee
        Employee employee = new Effective("Odair", "Antunes", "55201", 3000.0, 1000.0, 500.0);
        employee.salaryPayment();
        System.out.println();

        // Hired Employee
        employee = new Hired("Marlene", "Peixoto", "41528", 110.0, 50);
        employee.salaryPayment();
    }

}