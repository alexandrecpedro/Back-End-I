package Product_Quality;

public class Product {
    /** Attribute **/
    private String nome, embalagem;
    private int lote, peso;

    /** Constructor **/
    public Product(String nome, int peso, int lote, String embalagem) {
        this.nome = nome;
        this.peso = peso;
        this.lote = lote;
        this.embalagem = embalagem;
    }

    /** Getters/Setters **/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
