package MathCalc;

import MathCalc.model.ListaNumeros;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        // Configuring log4j.properties (Alternative)
        BasicConfigurator.configure();

        ListaNumeros lista1 = new ListaNumeros();
        lista1.addNumero(2);
        lista1.addNumero(3);
        lista1.addNumero(5);
        lista1.addNumero(8);
        lista1.addNumero(23);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.addNumero(1);
        lista1.qtdNumeros();
        lista1.media();

        ListaNumeros lista2 = new ListaNumeros();
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.addNumero(3);
        lista2.qtdNumeros();
        lista2.media();

        ListaNumeros lista3 = new ListaNumeros();
        lista3.qtdNumeros();
    }
}
