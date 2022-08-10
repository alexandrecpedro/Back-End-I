package Shapes.service;

public class FacadeFactory {
    /** Attributes **/
    private FlyweightTriangle flyweightTriangle;
    private FlyweightSquare flyweightSquare;

    /** Constructor **/
    public FacadeFactory(FlyweightTriangle flyweightTriangle, FlyweightSquare flyweightSquare) {
        this.flyweightTriangle = flyweightTriangle;
        this.flyweightSquare = flyweightSquare;
    }

    /** Getters/Setters **/
    public FlyweightTriangle getFlyweightTriangle() {
        return flyweightTriangle;
    }

    public void setFlyweightTriangle(FlyweightTriangle flyweightTriangle) {
        this.flyweightTriangle = flyweightTriangle;
    }

    public FlyweightSquare getFlyweightSquare() {
        return flyweightSquare;
    }

    public void setFlyweightSquare(FlyweightSquare flyweightSquare) {
        this.flyweightSquare = flyweightSquare;
    }

    /** Methods **/
    public void createShapes(String[][] shapesList) {
        for (int i = 0; i < shapesList.length; i++) {
            if (shapesList[i][0].equals("triangle")) {
                flyweightTriangle.getTriangle(shapesList[i][1]);
            } else if (shapesList[i][0].equals("square")) {
                flyweightSquare.getSquare(Integer.parseInt(shapesList[i][2]));
            }
        }
    }
}
