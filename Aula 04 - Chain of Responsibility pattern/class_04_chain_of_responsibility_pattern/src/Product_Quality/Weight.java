package Product_Quality;

public class Weight extends Manager {
    /** Method **/
    @Override
    public void verificar(Product product) {
        if (product.getPeso() > 1199 && product.getPeso() < 1301) {
            this.getGerenciadorSeguinte().verificar(product);
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                System.out.println("Produto rejeitado");
            }
        }
    }
}
