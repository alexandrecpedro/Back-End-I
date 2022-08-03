package SalesCategory;

public class Intern extends Seller {
    /** Constructor **/
    public Intern(String nome) {
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }

    /** Methods **/
    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    @Override
    public String mostrarCategoria(){
        int pontuacao = calcularPontos();
        if (pontuacao > 49 )
            return "Estagiário(a) experiente";
        else
            return "Estagiário(a) novato";
    }

    @Override
    public String toString() {
        return "Estagiário(a) " +
                "\nNome: " + this.nome +
                "\nTotal de vendas realizadas: " + this.vendas +
                "\nTotal de pontos: " + calcularPontos() +
                "\nCategoria: " + mostrarCategoria() + "\n";
    }
}
