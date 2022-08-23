import model.Company;
import model.Employee;

import java.io.*;

public class Challenge1 {
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
            FileOutputStream fileOutputStream = new FileOutputStream("employees.txt");
            // File goes out of project (external file)
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            // Writing subject inside this file
            objectOutputStream.writeObject(company);
            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /** Deserialize Section **/
        Company techCompany = null;
        try {
            // Search for external file
            FileInputStream fileInputStream = new FileInputStream("employees.txt");
            // Deserialize file
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Store the content of the read file/object
            techCompany = (Company) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(techCompany);
    }
}
