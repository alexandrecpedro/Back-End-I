package Product_Quality;

public class ManagerPackaging extends Manager {
    /** Method **/
    @Override
    public void verificar(Product product) {
        if (product.getEmbalagem().equalsIgnoreCase("saudável") ||
                product.getEmbalagem().equalsIgnoreCase("quase saudável")) {
            System.out.println("Aceito");
        } else {
            System.out.println("Rejeitado");
        }
    }
}
