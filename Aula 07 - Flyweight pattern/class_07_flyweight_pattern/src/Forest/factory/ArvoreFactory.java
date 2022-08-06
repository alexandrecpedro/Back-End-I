package Forest.factory;

import Forest.model.Arvore;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    /** Attributes **/
    private static final ArvoreFactory instance = new ArvoreFactory();

    private static Map<String , Arvore> arvoreCache = new HashMap<>();

    /** Constructor **/
    public ArvoreFactory() {
    }

    /** Getter **/
    public static ArvoreFactory getInstance() {
        return instance;
    }

    /** Method **/
    public Arvore criarArvore(String cor) {
        if (arvoreCache.containsKey(cor)) {
            return arvoreCache.get(cor);
        }

        Arvore arvore = null;

        switch (cor) {
            case "azul":
                arvore = new Arvore(100, 300, "azul");
                break;
            case "vermelho":
                arvore = new Arvore(500, 300, "vermelho");
                break;
            case "verde":
                arvore = new Arvore(200, 400, "verde");
                break;
        }

        arvoreCache.put(cor, arvore);
        return arvore;
    }
}
