package SalesCategory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Employee func1, func2;
    Affiliated afi1, afi2, afi3;
    Intern estag1, estag2;

    @BeforeEach
    public void doBefore() {
        func1 = new Employee("Pedro", 2);
        func1.vender(2);

        func2 = new Employee("Maria",1);
        func2.vender(1);

        afi1 = new Affiliated("Ramon");
        afi1.vender(4);

        afi2 = new Affiliated("Paulo");
        afi2.vender(2);

        afi3 = new Affiliated("José");

        func1.adicionaAfiliado(afi1);

        estag1 = new Intern("Mônica");
        estag1.vender(13);

        estag2 = new Intern("Pedro");
        estag2.vender(5);
    }

    @Test
    public void mostrarVendedores() {
        System.out.println();
        System.out.println(func1.toString());
        System.out.println(func2.toString());
        System.out.println(afi1.toString());
        System.out.println(afi2.toString());
        System.out.println(afi3.toString());
        System.out.println(estag1.toString());
        System.out.println(estag2.toString());
    }

    @Test
    public void calcularPontosTest() {
        // Employee 1
        assertEquals(30, func1.calcularPontos());
        // Employee 2
        assertTrue(func2.calcularPontos() > 9);
        // Affiliated 1
        assertFalse(afi1.calcularPontos() < 60);
        // Affiliated 2
        assertEquals(30, afi2.calcularPontos());
        // Affiliated 3
        assertTrue(afi3.calcularPontos() == 0);
    }

    public void mostrarCategoriaTest() {
        // Employee 1
        assertFalse(func1.mostrarCategoria() != "Aprendiz");
        // Employee 2
        assertEquals("Novato", func2.mostrarCategoria());
        // Affiliated 1
        assertTrue(afi1.mostrarCategoria() == "Mestre");
        // Affiliated 2
        assertEquals("Aprendiz", afi2.mostrarCategoria());
        // Affiliated 3
        assertFalse(afi3.mostrarCategoria() != "Novato");
        // Intern 1
        assertEquals("Estagiário(a) experiente", estag1.mostrarCategoria());
        // Intern 2
        assertTrue(estag2.mostrarCategoria() == "Estagiário(a) novato");
    }

}