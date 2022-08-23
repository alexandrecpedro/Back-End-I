import model.Company;
import model.Employee;

import java.io.*;
import java.util.ArrayList;

public class Challenge2 {
    public static void main(String[] args) {
        /** Instantiating a new company **/
        Company company = new Company("13541651311", "IT Communications");
        // Add employees
        company.addEmployees(new Employee("Jorge", "Kosovo",
                "234.897.876-91", 3500.00));
        company.addEmployees(new Employee("Christina", "López",
                "183.543.029-66", 4500.00));
        company.addEmployees(new Employee("Keanu", "Reeves",
                "012.765.192-84", 7300.00));
        company.addEmployees(new Employee("Silvester", "Stalone",
                "271.903.835-20", 3400.00));

        /** Serialize Section **/
        try {
            // Creating new file
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("employees.txt"));

            // Writing subject inside this file
            for (Employee employee : company.getEmployees()) {
                bufferedWriter.write(String.format("%s;%s;%s;%s", employee.getFirstName(),
                        employee.getLastName(), employee.getIdentificationDocument(),
                        employee.getSalary()));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /** Deserialize Section **/
        try {
            // Search for external file and deserialize it
            BufferedReader bufferedReader = new BufferedReader(new FileReader("employees.txt"));

            // Store the content of the read file/object
            String line = bufferedReader.readLine();
            ArrayList<Employee> employees = new ArrayList<>();

            while (line != null) {
                String[] split = line.split(";");
                Employee employee = new Employee(split[0], split[1], split[2],
                        Double.valueOf(split[3]));
                employees.add(employee);
            }

            System.out.println(employees);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
