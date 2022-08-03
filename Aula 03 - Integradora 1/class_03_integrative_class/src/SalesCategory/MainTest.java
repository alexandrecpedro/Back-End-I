package SalesCategory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {
    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;
    Estagiario estag1, estag2;

    @BeforeEach
    public void doBefore() {
        func1 = new Funcionario("Pedro", 2);
        func1.vender(2);

        func2 = new Funcionario("Maria",1);
        func2.vender(1);

        afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        afi2 = new Afiliado("Paulo");
        afi2.vender(1);

        afi3 = new Afiliado("José");

        func1.addAfiliado(afi1);

        estag1 = new Estagiario("Mônica");
        estag1.vender(13);

        estag2 = new Estagiario("Pedro");
        estag2.vender(5);
    }

    @Test
    public void mostrarVendedores() {
        System.out.println(func1.toString());
        System.out.println(func2.toString());
        System.out.println(afi1.toString());
        System.out.println(afi2.toString());
        System.out.println(afi3.toString());
        System.out.println(estag1.toString());
        System.out.println(estag2.toString());
    }

}