package Bank.entities;

public class User {
    /** Attributes **/
    private Long id;
    private String name, email;
    private double balance;

    /** Constructor **/
    public User(String name, String email, double balance) {
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    /** Getters/Setters **/
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** Method **/
    public double increaseBalance(double value) {
        this.balance += value;
        return this.balance;
    }
}
