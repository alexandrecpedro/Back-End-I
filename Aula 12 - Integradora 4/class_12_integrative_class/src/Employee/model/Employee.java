package Employee.model;

public class Employee {
    /** Attributes **/
    private int id;
    private String name, email;

    /** Constructor **/
    public Employee() {
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    /** Getters/Setters **/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /** Method **/
    @Override
    public String toString() {
        return "Employee" +
                "\nid = " + id +
                "\nname = " + name +
                "\nemail = " + email;
    }
}
