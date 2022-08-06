package Computer.model;

public class Computer {
    /** Attributes **/
    private int ram;
    private int hd;
    private static int contador;

    /** Constructor **/
    public Computer(int ram, int hd) {
        this.ram = ram;
        this.hd = hd;
        contador++;
        System.out.println("Contagem: " + contador);
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

    /** Method **/
    @Override
    public String toString() {
        return "Computer" +
                "\nram = " + ram + " GB" +
                "\nhd = " + hd + " GB";
    }
}
