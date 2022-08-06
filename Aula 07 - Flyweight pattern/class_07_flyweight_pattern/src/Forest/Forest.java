package Forest;

import Forest.factory.ArvoreFactory;
import Forest.model.Arvore;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    public static void main(String[] args) {
        ArvoreFactory arvoreFactory = ArvoreFactory.getInstance();
        List<Arvore> floresta = new ArrayList<>();

        for (int i = 0; i < 500_000; i++){
            // árvores vermelhas
            floresta.add(arvoreFactory.criarArvore("vermelho"));
            // árvores verdes
            floresta.add(arvoreFactory.criarArvore("verde"));
        }

        // print da memória usada
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024) + " bytes");

        // print da quantidade de instâncias
        System.out.println("Número de árvores: " + floresta.size());
    }
}
