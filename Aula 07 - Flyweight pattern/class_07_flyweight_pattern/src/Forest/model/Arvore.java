package Forest.model;

public class Arvore {
    /** Attributes **/
    private double altura, largura;
    private String cor, tipoArvore;
    private int contador;

    /** Constructor **/
    public Arvore(double altura, double largura, String cor, String tipoArvore) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.tipoArvore = tipoArvore;
        this.contador = 1;
    }

    /** Getters/Setters **/
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoArvore() {
        return tipoArvore;
    }

    public void setTipoArvore(String tipoArvore) {
        this.tipoArvore = tipoArvore;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    /** Method **/
    @Override
    public String toString() {
        return "Árvore" +
                "\ntipo: " + tipoArvore +
                "\naltura: " + altura +
                "\nlargura: " + largura +
                "\ncor: " + cor;
    }
}
