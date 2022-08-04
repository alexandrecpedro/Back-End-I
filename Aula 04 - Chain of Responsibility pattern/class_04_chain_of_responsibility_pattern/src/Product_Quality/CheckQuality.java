package Product_Quality;

public class CheckQuality {
    /** Attribute **/
    Manager inicial;

    /** Constructor **/
    public CheckQuality() {
        this.inicial = new ManagerBatchCode();
        Manager peso = new ManagerWeight();
        Manager embalagem = new ManagerPackaging();

        inicial.setGerenciadorSeguinte(peso);
        peso.setGerenciadorSeguinte(embalagem);
    }

    /** Method **/
    public void verificar(Product product){
        inicial.verificar(product);
    }
}
