package Ecommerce.model;

public class Cartao {
    /** Attributes **/
    private String numerosFrente;
    private String codSeguranca;
    private String dataVencimento;

    /** Constructor **/
    public Cartao(String numerosFrente, String codSeguranca, String dataVencimento) {
        this.numerosFrente = numerosFrente;
        this.codSeguranca = codSeguranca;
        this.dataVencimento = dataVencimento;
    }

    /** Getters/Setters **/
    public String getNumerosFrente() {
        return numerosFrente;
    }

    public void setNumerosFrente(String numerosFrente) {
        this.numerosFrente = numerosFrente;
    }

    public String getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /** Method **/
    @Override
    public String toString() {
        return "Cartão" +
                "\nNúmero = " + numerosFrente +
                "\nCódigo de Seguranca = " + codSeguranca +
                "\nData de Vencimento = " + dataVencimento;
    }
}
