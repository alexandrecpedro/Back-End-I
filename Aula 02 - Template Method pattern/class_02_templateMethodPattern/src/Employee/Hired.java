package Employee;

public class Hired extends Employee {
    // Attributes
    private double hourValue;
    private int hours;

    // Constructor
    public Hired(String name, String lastName, String accountNumber, double hourValue, int hours) {
        super(name, lastName, accountNumber);
        this.hourValue = hourValue;
        this.hours = hours;
    }

    // Getters/Setters
    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    // Methods
    @Override
    public double balanceCalculator() {
        return hourValue * hours;
    }

    @Override
    public void printReceipt(double amount) {
        System.out.println("Printed Receipt - Hired Employee - Value: " + amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("There was deposit an amount of " + amount + " at " + super.getName() + " account");
    }
}
