package Forest.factory;

import Forest.model.Arvore;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    /** Attributes **/
    private static Map<String , Arvore> arvoreMap = new HashMap<>();

    /** Method **/
    public static Arvore getArvore(double altura, double largura, String cor, String tipoArvore) {
        String dadosArvore = "Dados: " + "Altura: " + altura + " | Lagura: " + largura
                +  " | Cor: " + cor + " | Tipo da Árvore: " + tipoArvore;
        System.out.println(dadosArvore);

        if (arvoreMap.containsKey(dadosArvore)) {
            Arvore arvore = arvoreMap.get(dadosArvore);
            arvore.setContador(arvore.getContador() + 1);
            System.out.println("Árvore obtida da memória");
            return arvore;
        } else {
            arvoreMap.put(dadosArvore, new Arvore(altura, largura, cor, tipoArvore));
            System.out.println("Árvore criada");
            return arvoreMap.get(dadosArvore);
        }
    }
}
