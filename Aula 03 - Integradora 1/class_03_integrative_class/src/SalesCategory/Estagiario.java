package SalesCategory;

public class Estagiario extends Vendedor {

//    Constructor
    public Estagiario(String nome) {
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }

//    Methods
    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    @Override
    public String mostrarCategoria(){
        int pontuacao = calcularPontos();
        if (pontuacao < 50 )
            return "Estagiário(a) novato";
        else
            return "Estagiário(a) experiente";
    }

    @Override
    public String toString() {
        return "Estagiário(a) " +
                "\nNome: " + this.nome +
                "\nTotal de pontos: " + calcularPontos() +
                "\nCategoria: " + mostrarCategoria() + "\n";
    }
}
