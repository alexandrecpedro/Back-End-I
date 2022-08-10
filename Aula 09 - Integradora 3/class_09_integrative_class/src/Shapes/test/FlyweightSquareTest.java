//package Shapes.test;
//
//import Shapes.model.Quadrado;
//import Shapes.model.Triangulo;
//import Shapes.service.FlyweightSquare;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class FlyweightSquareTest {
//    @Test
//    void getQuadradoComTamanho2() {
//
//        Quadrado quadrado = FlyweightSquare.obterQuadrado(4);
//        quadrado.setCor("azul");
//
//        Quadrado quadrado1 = FlyweightSquare.obterQuadrado(4);
//        quadrado1.setCor("verde");
//
//        Quadrado quadrado2 = FlyweightSquare.obterQuadrado(6);
//        quadrado2.setCor("vermelho");
//
//        assertTrue(quadrado.getTamanho() == 2);
//        assertFalse(quadrado1.getCor().equals("verde"));
//        assertEquals(FlyweightSquare.quadradoMap.size(), 2);
//    }
//
//}
