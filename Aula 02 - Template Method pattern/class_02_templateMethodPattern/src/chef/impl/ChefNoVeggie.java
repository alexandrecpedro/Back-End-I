package chef.impl;

import chef.Chef;

public class ChefNoVeggie extends Chef {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando fatias de carne, queijo e presunto...");
    }

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando os ingredientes");
    }
}
