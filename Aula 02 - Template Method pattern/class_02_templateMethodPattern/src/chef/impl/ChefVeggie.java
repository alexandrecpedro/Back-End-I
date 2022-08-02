package chef.impl;


import chef.Chef;

public class ChefVeggie extends Chef {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando tomate e brócolis");
    }

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando ingredientes");

    }
}
