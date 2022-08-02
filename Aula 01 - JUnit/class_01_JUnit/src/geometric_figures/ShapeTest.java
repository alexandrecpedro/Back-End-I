package geometric_figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {
    @Test
    public void shouldReturnPositeResponseCircle(){
        Shape circle = new Circle(1.5);
        assertEquals(9.42477796076938, circle.calculatePerimeter());
        System.out.println(circle.toString());
        System.out.printf("perimeter = " + "%.2f", circle.calculatePerimeter());
    }

    @Test
    public void shouldReturnPositeResponseSquare(){
        Shape square = new Square(2);
        assertEquals(8 , square.calculatePerimeter());
        System.out.println("\n\n" + square.toString());
        System.out.println("perimeter = " + square.calculatePerimeter());
    }
}