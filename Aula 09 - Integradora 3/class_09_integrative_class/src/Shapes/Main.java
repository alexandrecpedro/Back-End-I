package Shapes;

import Shapes.model.Square;
import Shapes.model.Triangle;
import Shapes.service.FacadeFactory;
import Shapes.service.FlyweightSquare;
import Shapes.service.FlyweightTriangle;

public class Main {
    public static void main(String[] args) {
        /** Flyweight Pattern **/
        // Triangle
        FlyweightTriangle flyweightTriangle = new FlyweightTriangle();

        Triangle triangle1 = flyweightTriangle.getTriangle("Red");
        triangle1.setSize(2);
        Triangle triangle2 = flyweightTriangle.getTriangle("Red");
        triangle2.setSize(4);
        Triangle triangle3 = flyweightTriangle.getTriangle("Blue");
        triangle3.setSize(6);

        System.out.println("Triangle size: " + flyweightTriangle.getTriangleMap().size());
        System.out.println(triangle1.toString() + "\n");
        System.out.println(triangle2.toString() + "\n");
        System.out.println(triangle3.toString() + "\n");

        // Square
        FlyweightSquare flyweightSquare = new FlyweightSquare();

        Square square1 = flyweightSquare.getSquare(4);
        square1.setColor("Blue");
        Square square2 = flyweightSquare.getSquare(4);
        square2.setColor("Green");
        Square square3 = flyweightSquare.getSquare(8);
        square3.setColor("Yellow");

        System.out.println("Square size: " + flyweightSquare.getSquareMap().size());
        System.out.println(square1.toString() + "\n");
        System.out.println(square2.toString() + "\n");
        System.out.println(square3.toString());

        /** Facade Pattern **/
        String[][] list = {
                {triangle1.getClass().getName(), triangle1.getColor(), String.valueOf(triangle1.getSize())},
                {triangle2.getClass().getName(), triangle2.getColor(), String.valueOf(triangle2.getSize())},
                {triangle3.getClass().getName(), triangle3.getColor(), String.valueOf(triangle3.getSize())},
                {square1.getClass().getName(), square1.getColor(), String.valueOf(square1.getSize())},
                {square2.getClass().getName(), square2.getColor(), String.valueOf(square2.getSize())},
                {square3.getClass().getName(), square3.getColor(), String.valueOf(square3.getSize())},
        };

        FacadeFactory facadeFactory = new FacadeFactory(flyweightTriangle, flyweightSquare);
        facadeFactory.createShapes(list);
    }
}
