package TurismService.service.impl;

import TurismService.model.Viagem;
import TurismService.service.IFacadeTurismo;

public class FacadeTurismo implements IFacadeTurismo {
    /** Attributes **/
    // Armazenam nas variáveis as instâncias
    private VooApi vooAPI;
    private HotelApi hotelAPI;

    /** Constructor **/
    // Construtor que cria as instâncias
    public FacadeTurismo() {
        vooAPI = new VooApi();
        hotelAPI = new HotelApi();
    }

    /** Method **/
    // Simplifica as buscas de voos e hotéis
    public Viagem buscar(Viagem viagem) {
        viagem.setLinhaAerea(vooAPI.buscarVoos(viagem.getDataPartida(), viagem.getDataRetorno(),
                viagem.getOrigem(), viagem.getDestino()));
        viagem.setHotel(hotelAPI.buscarHoteis(viagem.getDataPartida(), viagem.getDataRetorno(),
                viagem.getDestino()));

        return viagem;
    }
}
