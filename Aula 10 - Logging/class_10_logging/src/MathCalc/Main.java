package MathCalc;

import MathCalc.model.ListaNumeros;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Main {

    private static final Logger logger = Logger.getLogger(ListaNumeros.class);

    public static void main(String[] args) {
        // Configuring log4j.properties (Alternative)
        BasicConfigurator.configure();

        ArrayList<Integer> lista1 = new ArrayList();
        lista1.add(1);
        lista1.add(5);
        lista1.add(9);
        lista1.add(10);
        lista1.add(111);
        lista1.add(49);

        ArrayList<Integer> lista2 = new ArrayList();
        lista2.add(5);
        lista2.add(6);
        lista2.add(-1);
        lista2.add(40);
        lista2.add(13);
        lista2.add(9);
        lista2.add(40);
        lista2.add(4);
        lista2.add(7);
        lista2.add(20);
        lista2.add(30);

        ArrayList<Integer> lista3 = new ArrayList();

        ListaNumeros listaNumeros1 = new ListaNumeros(lista1);
        ListaNumeros listaNumeros2 = new ListaNumeros(lista2);
        ListaNumeros listaNumeros3 = new ListaNumeros(lista3);

        try {
            System.out.println("Lista 1");
            listaNumeros1.getInfo();
            System.out.println();
            System.out.println("Lista 2");
            listaNumeros2.getInfo();
            System.out.println();
            System.out.println("Lista 3");
            listaNumeros3.getInfo();
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
