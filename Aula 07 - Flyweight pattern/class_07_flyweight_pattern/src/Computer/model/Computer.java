package Computer.model;

public class Computer {
    /** Attributes **/
    private String id;
    private int ram, hd, contador;

    /** Constructor **/
    public Computer(int ram, int hd) {
        this.ram = ram;
        this.hd = hd;
        this.contador = 1;
    }

    /** Getters/Setters **/
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
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
        return "Computer" +
                "\nram = " + ram + " GB" +
                "\nhd = " + hd + " GB" +
                "\ncontador = " + contador;
    }
}
