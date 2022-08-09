package Clothes.test;

import Clothes.model.Roupa;
import Clothes.service.RoupaFlyweightFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoupaTest {
    RoupaFlyweightFactory roupaFactory;

    @BeforeEach
    public void antesDoTeste() {
        roupaFactory = new RoupaFlyweightFactory();
    }

    @Test
    public void checarSeRetornaRoupa() {
        Roupa roupa = roupaFactory.obterRoupaPorTamanho("M");

        assertEquals(roupa != null, true);

        roupa.seteNovo(false);
        roupa.setImportada(true);
        roupa.setTipo("blusa");

        System.out.println(roupa);
    }

    @Test
    public void medirTamanhoDaFabrica() {
        Roupa calcaM1 = roupaFactory.obterRoupaPorTamanho("M");
        Roupa calcaM2 = roupaFactory.obterRoupaPorTamanho("M");
        Roupa calcaM3 = roupaFactory.obterRoupaPorTamanho("M");
        Roupa blusaG1 = roupaFactory.obterRoupaPorTamanho("G");
        Roupa blusaG2 = roupaFactory.obterRoupaPorTamanho("G");

        System.out.println("Tamanho da lista de roupas por tamanhos: " + roupaFactory.getListaTamanhosSize());

        assertEquals(roupaFactory.getListaTamanhosSize(), 2);
    }
}
