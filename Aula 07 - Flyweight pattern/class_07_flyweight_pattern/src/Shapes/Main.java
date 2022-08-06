package Shapes;

import Shapes.factory.FlyweightFactory;
import Shapes.model.Circle;

public class Main {
    /** Static Variables **/
    private static final String colors[] = {"purple", "blue", "green", "black"};

    public static void main(String[] args) {
        // Creating objects
        for (int i = 0; i < 100; i++) {
            Circle circle = FlyweightFactory.obtainCircle(randomColor());
            circle.setRadius(i + 5);
            circle.setLength("Length: " + i + 2);

            circle.draw();
        }
    }

    /** Random color **/
    private static String randomColor() {
        return colors[(int)(Math.random() * colors.length)];
    }
}
