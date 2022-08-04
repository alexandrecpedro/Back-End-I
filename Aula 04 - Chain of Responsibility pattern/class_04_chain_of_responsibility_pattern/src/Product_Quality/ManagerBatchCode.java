package Product_Quality;

public class ManagerBatchCode extends Manager {
    /** Method **/
    @Override
    public void verificar(Product product) {
        if (product.getLote() > 999 && product.getLote() < 2001) {
            if (getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(product);
            }
        } else {
            System.out.println("Rejeitado");
        }
    }
}
