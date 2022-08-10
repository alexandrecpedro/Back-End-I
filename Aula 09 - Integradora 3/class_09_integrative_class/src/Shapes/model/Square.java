package Shapes.model;

public class Square {
    /** Attributes **/
    private String color;
    private int size;

    /** Constructor **/
    public Square(int size) {
        this.size = size;
    }

    /** Getters/Setters **/
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    /** Method **/
    @Override
    public String toString() {
        return "Quadrado" +
                "\ncolor = " + color +
                "\nsize = " + size;
    }
}
