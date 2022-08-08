package Computer.factory;

import Computer.model.Computer;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    /** Attribute **/
    private static Map<String, Computer> macFlyweight = new HashMap<>();

    /** Method **/
    public static Computer getComputer(int ram, int hd) {
        String id = "id: " + ram + " GB" + " : " + hd + " GB";
        System.out.println(id);

        if (macFlyweight.containsKey(id)) {
            Computer computer = macFlyweight.get(id);
            computer.setContador(computer.getContador() + 1);
            System.out.println("PC obtido da memória");
            return computer;
        } else {
            macFlyweight.put(id, new Computer(ram, hd));
            System.out.println("PC criado");
            return macFlyweight.get(id);
        }
    }
}
