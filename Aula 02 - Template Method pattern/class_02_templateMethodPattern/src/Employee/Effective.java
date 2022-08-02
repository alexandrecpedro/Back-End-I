package Employee;

public class Effective extends Employee {
    // Attribute
    private double baseSalary, discount, bonuses;

    // Constructor
    public Effective(String name, String lastName, String accountNumber, double baseSalary, double discount, double bonuses) {
        super(name, lastName, accountNumber);
        this.baseSalary = baseSalary;
        this.discount = discount;
        this.bonuses = bonuses;
    }

    // Getters/Setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getBonuses() {
        return bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    // Methods
    @Override
    public double balanceCalculator() {
        return baseSalary + bonuses - discount;
    }

    @Override
    public void printReceipt(double amount) {
        System.out.println("Printed Receipt - Effective Employee - Value: " + amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("There was deposit an amount of " + amount + " at " + super.getName() + " account");
    }
}
