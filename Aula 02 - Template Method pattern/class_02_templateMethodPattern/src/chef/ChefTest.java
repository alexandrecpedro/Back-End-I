package chef;

import chef.impl.ChefNoVeggie;
import chef.impl.ChefVeggie;
import org.junit.jupiter.api.Test;

class ChefTest {

    @Test
    void fazerPizzas() {
        Chef cozinheiroVeggie = new ChefVeggie();
        Chef cozinheiroNoVeggie = new ChefNoVeggie();

        System.out.println("PIZZA VEGANA:");
        cozinheiroVeggie.fazerPizza();
        System.out.println("PIZZA TRADICIONAL:");
        cozinheiroNoVeggie.fazerPizza();
    }
}