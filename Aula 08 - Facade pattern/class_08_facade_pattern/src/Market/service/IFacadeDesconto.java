package Market.service;

import Market.model.Cartao;
import Market.model.Produto;

public interface IFacadeDesconto {

    int desconto(Cartao cartao, Produto produto, int quantidade);

}
