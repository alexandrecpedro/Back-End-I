package Product_Quality;

public class ManagerWeight extends Manager {
    /** Method **/
    @Override
    public void verificar(Product product) {
        if (product.getPeso() > 1199 && product.getPeso() < 1301) {
            if (getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(product);
            }
        } else {
            System.out.println("Rejeitado");
        }
    }
}
