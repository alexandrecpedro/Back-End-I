package Calculator;

import Calculator.model.Calculator;
import org.apache.log4j.BasicConfigurator;

public class Main {
    public static void main(String[] args) {
        // Alternativa para configurar o log4j.properties
        BasicConfigurator.configure();

        // Calculator 1
        Calculator calculator1 = new Calculator(1, 3);
        int sum = calculator1.sum();
        System.out.println(sum);
        System.out.println("=========================");

        // Calculator 2
        Calculator calculator2 = new Calculator(1, 0);
        double division = calculator2.divide();
        System.out.println(division);
        System.out.println("=========================");

        // Calculator 3
        Calculator calculator3 = new Calculator(4, 2);
        double division2 = calculator3.divide();
        System.out.println(division2);
    }
}
