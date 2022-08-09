package Market.model;

public class Cartao {
    /** Attributes **/
    private String numero, banco;

    /** Constructor **/
    public Cartao(String numero, String banco) {
        this.numero = numero;
        this.banco = banco;
    }

    /** Getters/Setters **/
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }
}
