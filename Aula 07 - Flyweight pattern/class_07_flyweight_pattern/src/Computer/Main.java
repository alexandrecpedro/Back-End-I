package Computer;

import Computer.factory.ComputerFactory;
import Computer.model.Computer;

public class Main {

    public static void main(String[] args) {

        // App Execution
        ComputerFactory computerFactory = new ComputerFactory();
        Computer mac1 = computerFactory.getComputer(8,500);
        Computer windows = computerFactory.getComputer(16,128);
        Computer mac2 = computerFactory.getComputer(8,500);

        System.out.println(mac1.toString());
        System.out.println();
        System.out.println(mac2.toString());
        System.out.println();
        System.out.println(windows.toString());
    }

}
