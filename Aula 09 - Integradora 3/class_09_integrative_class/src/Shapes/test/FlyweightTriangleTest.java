//package Shapes.test;
//
//import Shapes.model.Quadrado;
//import Shapes.model.Triangulo;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import Shapes.service.FlyweightTriangle;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class FlyweightTriangleTest {
//
//
//    @Test
//    void getTrianguloComTamanho2Test() {
//
//        Triangulo triangulo = FlyweightTriangle.obterTriangulo("vermelho");
//        triangulo.setTamanho(2);
//
//        Triangulo triangulo1 = FlyweightTriangle.obterTriangulo("vermelho");
//        triangulo1.setTamanho(4);
//
//        Triangulo triangulo2 = FlyweightTriangle.obterTriangulo("azul");
//        triangulo2.setTamanho(6);
//
//        assertEquals(triangulo.getCor(), "vermelho");
//        assertFalse(triangulo1.getTamanho() != 4);
//        //assertTrue(FlyweightTriangle.trianguloMap.size() == 2);
//    }
//}
