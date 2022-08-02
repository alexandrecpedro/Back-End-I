package geometric_figures;

public class Square extends Shape {
//    Attributes
    private double side;

//    Constructor
    public Square(double side) {
        this.side = side;
    }

//    Getters/Setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }

//    toString
    @Override
    public String toString() {
        return "Square" +
                "\nside = " + side;
    }
}
