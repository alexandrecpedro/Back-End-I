package MathCalc.model;

import org.apache.log4j.Logger;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    /** Attributes **/
    private static final DecimalFormat df = new DecimalFormat("0.00");

    private static final Logger logger = Logger.getLogger(ListaNumeros.class);
    private List<Integer> listaInteiros = new ArrayList<>();

    /** Getter **/
    public List<Integer> getListaInteiros() {
        return listaInteiros;
    }

    /** Methods **/
    public void addNumero(int numero) {
        listaInteiros.add(numero);
    }

    public void qtdNumeros() throws Exception {
        if (listaInteiros.size() > 10) {
            logger.info("A lista tem mais de 10 itens!");
        } else if (listaInteiros.size() > 5) {
            logger.info("A lista tem mais de 5 itens!");
        } else if (listaInteiros.size() == 0) {
            logger.error("A lista está vazia!");
            throw new Exception();
        }
    }

    public void media() {
        double media = listaInteiros.stream().reduce(0, Integer::sum ) / listaInteiros.size();
        logger.info("A média da lista é: " + df.format(media));
    }

}
