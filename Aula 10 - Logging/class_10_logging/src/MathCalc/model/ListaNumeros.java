package MathCalc.model;

import org.apache.log4j.Logger;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    /** Attributes **/
    private static final DecimalFormat df = new DecimalFormat("#.##");

    private static final Logger logger = Logger.getLogger(ListaNumeros.class);
    private List<Integer> listaInteiros = new ArrayList<>();

    /** Constructor **/
    public ListaNumeros(List<Integer> listaInteiros) {
        this.listaInteiros = listaInteiros;
    }

    /** Methods **/
    // Media of numbers
    public double getMedia() {
        double media = 0;

        for (int numero: listaInteiros) {
            media += numero;
        }

        return media / listaInteiros.size();
        // return listaInteiros.stream().reduce(0, Integer::sum) / listaInteiros.size();
    }

    // Max number
    public int getMax() {
        int max = listaInteiros.get(0);

        for (int numero: listaInteiros) {
            if (! (numero < max)) {
                max = numero;
            }
        }
        return max;
    }

    // Min number
    public int getMin() {
        int min = listaInteiros.get(0);

        for (int numero: listaInteiros) {
            if (!(numero > min)) {
                min = numero;
            }
        }
        return min;
    }

    // List of numbers info
    public void getInfo() throws Exception {
        if (listaInteiros.size() == 0) {
            throw new Exception("A lista está vazia");
        } else if (listaInteiros.size() > 5 ) {
            logger.info("O comprimento da lista é maior que 5");
        } else if (listaInteiros.size() > 10) {
            logger.info("O comprimento da lista é maior que 10");
        }

        logger.info("A média da lista é: " + df.format(getMedia()));
        // logger.info("A média da lista é: " + getMedia());
        logger.info("O maior valor da lista é: " + getMax());
        logger.info("O menor valor da lista é: " + getMin());
    }

}
