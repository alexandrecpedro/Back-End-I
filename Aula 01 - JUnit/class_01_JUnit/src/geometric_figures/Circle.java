package geometric_figures;

public class Circle extends Shape {
//    Attributes
    private double radius;

//    Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

//    Getters/Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

//    toString
    @Override
    public String toString() {
        return "Circle" +
                "\nradius = " + radius;
    }
}
