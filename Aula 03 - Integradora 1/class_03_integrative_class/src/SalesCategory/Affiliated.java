package SalesCategory;

public class Affiliated extends Seller {
    /** Constructor **/
    public Affiliated(String nome) {
        super.nome = nome;
        super.PONTOS_POR_VENDA = 15;
    }

    /** Methods **/
    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    @Override
    public String toString() {
        return "Vendedor(a) Afiliado(a)" +
                "\nNome: " + this.nome +
                "\nTotal de vendas realizadas: " + this.vendas +
                "\nTotal de pontos: " + calcularPontos() +
                "\nCategoria: " + mostrarCategoria() + "\n";
    }

}
