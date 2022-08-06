package Shapes.model;

public class Circle {
    /** Attributes **/
    private double radius;
    private String color, length;

    /** Constructor **/
    public Circle(String color) {
        this.color = color;
    }

    /** Getters/Setters **/
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    /** Methods **/
    public void draw() {
        System.out.println("Drawing a " + color + " colored object");
    }

    @Override
    public String toString() {
        return "Circle" +
                "\nradius = " + radius +
                "\ncolor = " + color +
                "\nlength = " + length;
    }
}
