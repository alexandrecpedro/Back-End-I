package Product_Quality;

public abstract class Manager {
    /** Attributes **/
    private Manager gerenciadorSeguinte;

    /** Getters/Setters **/
    public Manager getGerenciadorSeguinte(){
        return this.gerenciadorSeguinte;
    }

    public void setGerenciadorSeguinte(Manager gerenciador){
        this.gerenciadorSeguinte = gerenciador;
    }

    /** Methods **/
    public abstract void verificar(Product product);
}
