package Shapes.factory;

import Shapes.model.Circle;

import java.util.HashMap;
import java.util.Objects;

public class FlyweightFactory {
    /** Attributes **/
    private static final HashMap<String, Circle> circleMap = new HashMap();

    /** Method **/
    public static Circle obtainCircle(String color) {
        Circle circle = circleMap.get(color);

        if (Objects.isNull(circle)) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a " + color + " colored circle");
        }

        return circle;
    }
}
