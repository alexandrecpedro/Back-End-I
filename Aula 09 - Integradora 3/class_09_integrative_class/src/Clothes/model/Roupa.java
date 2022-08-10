package Clothes.model;

public class Roupa {
    private String tamanho, tipo;
    private boolean eNovo, importada;

    public Roupa(String tamanho) {
        this.tamanho = tamanho;
    }

    public Roupa(boolean importada) {
        this.importada = importada;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean iseNovo() {
        return eNovo;
    }

    public void seteNovo(boolean eNovo) {
        this.eNovo = eNovo;
    }

    public boolean isImportada() {
        return importada;
    }

    public void setImportada(boolean importada) {
        this.importada = importada;
    }

    @Override
    public String toString() {
        return "Roupa" +
                "\ntamanho: " + tamanho +
                "\ntipo: " + tipo +
                "\neNovo: " + eNovo +
                "\nimportada: " + importada;
    }
}
