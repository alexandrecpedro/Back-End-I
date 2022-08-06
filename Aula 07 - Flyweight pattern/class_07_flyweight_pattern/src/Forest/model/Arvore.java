package Forest.model;

public class Arvore {
    /** Attributes **/
    private double altura;
    private double largura;
    private String cor;
    private static int contagem;

    /** Constructor **/
    public Arvore(double altura, double largura, String cor) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        contagem++;
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

    /** Method **/
    @Override
    public String toString() {
        return "Árvore" +
                "\naltura: " + altura +
                "\nlargura: " + largura +
                "\ncor: " + cor;
    }
}
