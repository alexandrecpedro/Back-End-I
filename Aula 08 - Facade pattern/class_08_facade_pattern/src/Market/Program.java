package Market;

import Market.model.Cartao;
import Market.model.Produto;
import Market.service.impl.FacadeDesconto;

public class Program {
    public static void main(String[] args) {
        FacadeDesconto facade = new FacadeDesconto();
        Cartao cartao = new Cartao("332255", "Star Bank");
        Produto produto = new Produto("Leite em pó", "Lata");
        System.out.println("Desconto concedido: " +
                facade.desconto(cartao, produto, 15) +
                "%");
    }

}
