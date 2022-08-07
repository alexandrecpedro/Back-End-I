package Market.service.impl;

import Market.model.Cartao;
import Market.model.Produto;
import Market.service.IFacadeDesconto;

public class FacadeDesconto implements IFacadeDesconto {

    // Armazenar as variáveis para as instâncias
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    public FacadeDesconto() {
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    // A utilização das APIs para os cálculos dos descontos
    public int desconto(Cartao cartao, Produto produto, int quantidade) {

        int desconto = 0;
        desconto += apiQuantidade.desconto(quantidade);
        desconto += apiProduto.desconto(produto);
        desconto += apiCartao.desconto(cartao);
        return desconto;

    }

}
