package Market.service.impl;

import Market.model.Produto;

public class ApiProduto {

    /** Method **/
    public int desconto(Produto produto) {
        if (produto.getTipo().compareTo("Lata") == 0) {
            return 10;
        } else {
            return 0;
        }

    }

}
