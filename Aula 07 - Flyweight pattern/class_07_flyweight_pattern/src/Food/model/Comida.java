package Food.model;

public class Comida {
    private String tipoComida;
    private int preco;
    private boolean temAlface;

    public Comida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public boolean isTemAlface() {
        return temAlface;
    }

    public void setTemAlface(boolean temAlface) {
        this.temAlface = temAlface;
    }

    public void descricaoDaComida() {
        System.out.println("É um/uma " + getTipoComida() + " que custa: " + getPreco());
    }

    @Override
    public String toString() {
        String hasLettuce;
        if (temAlface) {
            hasLettuce = "Sim";
        } else {
            hasLettuce = "Não";
        }
        return "Comida" +
                "\nTipo de comida = " + tipoComida +
                "\nPreço = " + preco +
                "\nTem alface? " + hasLettuce;
    }
}
