package geometric_figures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeTest {
    /** Attributes **/
    Shape circle, square;

    /** Methods **/
    @BeforeEach
    void doBefore() {
        circle = new Circle(1.5);
        square = new Square(2);
    }

    /** Tests **/
    @Test
    public void shouldReturnPositeResponseCircle(){
        assertEquals(9.42477796076938, circle.calculatePerimeter());
        System.out.println(circle.toString());
        System.out.printf("perimeter = " + "%.2f", circle.calculatePerimeter());
    }

    @Test
    public void shouldReturnPositeResponseSquare(){
        assertEquals(8 , square.calculatePerimeter());
        System.out.println("\n\n" + square.toString());
        System.out.println("perimeter = " + square.calculatePerimeter());
    }
}