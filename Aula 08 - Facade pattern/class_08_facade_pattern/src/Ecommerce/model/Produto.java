package Ecommerce.model;

public class Produto {
    /** Attributes **/
    private String produtoId;
    private Integer quantidade;
    private Integer valor;
    private String nome;

    /** Constructor **/
    public Produto(String produtoId, Integer quantidade, Integer valor, String nome) {
        this.produtoId = produtoId;
        this.quantidade = quantidade;
        this.valor = valor;
        this.nome = nome;
    }

    /** Getters/Setters **/
    public String getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(String produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /** Method **/
    @Override
    public String toString() {
        return "Produto" +
                "\nProdutoId = " + produtoId +
                "\nQuantidade = " + quantidade +
                "\nValor = " + valor +
                "\nNome = " + nome;
    }
}
