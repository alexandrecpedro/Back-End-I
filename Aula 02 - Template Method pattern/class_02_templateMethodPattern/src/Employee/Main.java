package Employee;

public class Main {
    public static void main(String[] args) {
        // Effective Employee
        Employee effective = new Effective("Odair", "Antunes", "55201",
                3000.0, 1000.0, 500.0);
        effective.salaryPayment();
        System.out.println();

        // Hired Employee
        Employee hired = new Hired("Marlene", "Peixoto", "41528",
                110.0, 50);
        hired.salaryPayment();
    }
}
