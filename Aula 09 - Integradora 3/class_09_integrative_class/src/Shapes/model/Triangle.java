package Shapes.model;

public class Triangle {
    /** Attributes **/
    private String color;
    private int size;

    /** Constructor **/
    public Triangle(String color) {
        this.color = color;
    }

    /** Getters/Setters **/
    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /** Method **/
    @Override
    public String toString() {
        return "Triangle" +
                "\ncolor: " + this.color +
                "\nsize: " + this.size;
    }
}
