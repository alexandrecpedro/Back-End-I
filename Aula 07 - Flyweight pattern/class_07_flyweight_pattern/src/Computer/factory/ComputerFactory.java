package Computer.factory;

import Computer.model.Computer;

import java.util.HashMap;
import java.util.Map;

public class ComputerFactory {
    /** Attribute **/
    private static Map<String, Computer> macFlyweight = new HashMap<>();

    /** Method **/
    public static Computer getComputer(int ram, int disco) {
        String comp = "Comp: " + ram + " GB" + ": " + disco + " GB";
        System.out.println(comp);

        if (!macFlyweight.containsKey(comp)) {
            macFlyweight.put(comp, new Computer(ram, disco));
            System.out.println("PC criado");
            return macFlyweight.get(comp);
        }

        System.out.println("PC obtido da memória");
        return macFlyweight.get(comp);
    }

}
