package SalesCategory;

public class Afiliado extends Vendedor {

//    Constructor
    public Afiliado(String nome){
        super.nome = nome;
        super.PONTOS_POR_VENDA = 15;
    }

//    Methods
    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

}
