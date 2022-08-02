package Employee;

public abstract class Employee {
    // Attributes
    private String name, lastName, accountNumber;

    // Constructor
    public Employee(String name, String lastName, String accountNumber) {
        this.name = name;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    // Getters/Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Methods
    public void salaryPayment() {
        double amount = balanceCalculator();
        printReceipt(amount);
        deposit(amount);
    }

    abstract double balanceCalculator();

    abstract void printReceipt(double amount);

    abstract void deposit(double amount);
}
