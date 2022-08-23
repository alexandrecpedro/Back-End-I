package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Company implements Serializable {
    /** Attributes **/
    private String cnpj, corporateName;
    private List<Employee> employees;

    /** Constructor **/
    public Company(String cnpj, String corporateName) {
        this.cnpj = cnpj;
        this.corporateName = corporateName;
        this.employees = new ArrayList<>();
    }

    /** Getters/Setters **/
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    /** Methods **/
    public void addEmployees(Employee employee) {
        employees.add(employee);
    }

    @Override
    public String toString() {
        return "Company" +
                "\nCNPJ = " + cnpj +
                "\nCorporate Name = " + corporateName +
                "\nEmployees = " + employees.toString();
    }
}
