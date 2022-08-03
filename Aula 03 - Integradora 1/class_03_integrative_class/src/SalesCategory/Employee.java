package SalesCategory;

import java.util.ArrayList;

public class Employee extends Seller {
    /** Attributes **/
    private int anosAntiguidade;
    private ArrayList<Seller> afiliados = new ArrayList<>();

    /** Constructor **/
    public Employee(String nome, int anosAntiguidade) {
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
        this.anosAntiguidade = anosAntiguidade;
    }

    /** Methods **/
    // agrega um afiliado ao funcionario, e por sua vez soma os pontos
    public void adicionaAfiliado(Seller afiliado) {
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome + " agora é afiliado de " + super.nome);
    }

    // implementação do método abstrato
    // por cada ano de antiguidade obtem 5 pontos, por cada afiliado obtém 10
    @Override
    public int calcularPontos() {
        return (this.afiliados.size() * 10) + (this.anosAntiguidade * 5) + (this.vendas * PONTOS_POR_VENDA);
    }
}
