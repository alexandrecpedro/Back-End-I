package SalesCategory;

//validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedor {
//    Attributes
    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;

//    Methods
    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+ qtdVendas + " vendas.");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos
    a serem considerados*/
    public abstract int calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
    da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria(){
        int pontuacao = calcularPontos();
        if (pontuacao < 20 )
            return "Novato";
        else if (pontuacao >= 20 && pontuacao <= 30)
            return "Aprendiz";
        else if (pontuacao >= 31 && pontuacao <= 40)
            return "Bom";
        else
            return "Mestre";
    }

    @Override
    public String toString() {
        return "Seller" +
                "\nNome: " + this.nome +
                "\nTotal de pontos: " + calcularPontos() +
                "\nCategoria: " + mostrarCategoria() + "\n";
    }
}
