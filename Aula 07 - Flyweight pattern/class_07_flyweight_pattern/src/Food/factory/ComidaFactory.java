package Food.factory;

import Food.model.Comida;

import java.util.HashMap;
import java.util.Objects;

public class ComidaFactory {
    private static final HashMap<String, Comida> COMIDA_MAP = new HashMap<>();

    public static Comida getComida(final String tipoComida) {
        Comida comida = COMIDA_MAP.get(tipoComida);
        if (Objects.isNull(comida)) {
            comida = new Comida(tipoComida);
            COMIDA_MAP.put(tipoComida, comida);
            System.out.println("Criando objeto comida de tipo: " + tipoComida);
        }
        return comida;
    }
}
