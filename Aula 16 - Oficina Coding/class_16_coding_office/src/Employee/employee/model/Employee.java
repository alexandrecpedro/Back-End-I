package Employee.employee.model;

public class Employee {
    /** Attributes **/
    private Integer id;
    private String firstName, lastName, cpf, phone, position;
    private Boolean access;

    /** Constructor **/
    public Employee(String firstName, String lastName, String cpf, String phone, String position, Boolean access) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.phone = phone;
        this.position = position;
        this.access = access;
    }

    public Employee(Integer id, String firstName, String lastName, String cpf, String phone, String position, Boolean access) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.phone = phone;
        this.position = position;
        this.access = access;
    }

    /** Getters/Setters **/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getAccess() {
        return access;
    }

    public void setAccess(Boolean access) {
        this.access = access;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Employee {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", phone='" + phone + '\'' +
                ", position='" + position + '\'' +
                ", access=" + access +
                '}';
    }
}
