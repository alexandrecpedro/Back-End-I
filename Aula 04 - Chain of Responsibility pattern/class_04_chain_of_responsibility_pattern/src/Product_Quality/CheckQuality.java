package Product_Quality;

public class CheckQuality {
    /** Attribute **/
    Manager inicial;

    /** Constructor **/
    public CheckQuality() {
        this.inicial = new BatchCode();
        Manager peso = new Weight();
        Manager embalagem = new Packaging();
        Manager spam = new ManagerSpam();

        inicial.setManagerSeguinte(comercial);
        comercial.setManagerSeguinte(tecnica);
        tecnica.setManagerSeguinte(spam);
    }

    /** Method **/
    public void verificar(Product product){
        inicial.verificar(product);
    }
}
