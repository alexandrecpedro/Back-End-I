package TurismService.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HotelApi {
    /** Method **/
    // Procura os hotéis conforme um horário escolhido
    public String buscarHoteis(String dataPartida, String dataRetorno, String cidade) {

        List<String> hoteis = Arrays.asList("Hotel Fazenda", "Hotel Minuano", "Hotel California", "Hotel Cecil");

        Random r = new Random();

        return hoteis.get(r.nextInt(hoteis.size()));
    }

}
