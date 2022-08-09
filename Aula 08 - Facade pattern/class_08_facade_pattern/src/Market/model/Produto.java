package Market.model;

public class Produto {
    /** Attributes **/
    private String nome, tipo;

    /** Constructor **/
    public Produto(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    /** Getters/Setters **/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
