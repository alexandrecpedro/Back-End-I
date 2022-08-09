package Market.service.impl;

import Market.model.Produto;

public class ApiProduto {
    /** Method **/
    public int desconto(Produto produto) {
        if (produto.getTipo().equals("Lata")) {
            return 10;
        } else {
            return 0;
        }

    }

}
