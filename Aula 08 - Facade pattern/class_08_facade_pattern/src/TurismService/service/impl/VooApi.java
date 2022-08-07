package TurismService.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class VooApi {
    /** Method **/
    // Irá procurar os voos conforme um horário escolhido
    public String buscarVoos(String dataPartida, String dataRetorno, String origem, String destino) {

        List<String> linhasAereas = Arrays.asList("TAM", "Azul", "Gol");

        Random r = new Random();

        return linhasAereas.get(r.nextInt(linhasAereas.size()));
    }

}
