package Forest;

import Forest.factory.ArvoreFactory;
import Forest.model.Arvore;

import java.text.NumberFormat;

public class Forest {
    public static void main(String[] args) {
        NumberFormat inteiro = NumberFormat.getInstance();

        ArvoreFactory arvoreFactory = new ArvoreFactory();
        Arvore arvoreFrutifera = null;
        Arvore arvoreOrnamental = null;

        for (int i = 0; i < 500_000; i++){
            // árvores vermelhas
            arvoreFrutifera = arvoreFactory.getArvore(500, 300,
                    "Vermelho", "Frutífera");
            // árvores verdes
            arvoreOrnamental = arvoreFactory.getArvore(200, 400,
                    "Verde", "Ornamental");
        }

        // print da memória usada
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " +
                (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024) + " bytes");

        // print da quantidade de instâncias
        System.out.println("Número de árvores frutíferas: " + inteiro.format(arvoreFrutifera.getContador()));
        System.out.println("Número de árvores ornamentais: " + inteiro.format(arvoreFrutifera.getContador()));
    }
}
