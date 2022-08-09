package Market.service.impl;

import Market.model.Cartao;

public class ApiCartao {

    /** Method **/
    public int desconto(Cartao cartao) {
        if (cartao.getBanco().equals("Star Bank")) {
            return 20;
        } else {
            return 0;
        }

    }

}
