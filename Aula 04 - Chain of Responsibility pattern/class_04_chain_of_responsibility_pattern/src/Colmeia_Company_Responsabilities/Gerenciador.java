package Colmeia_Company_Responsabilities;

public abstract class Gerenciador {
    /** Attributes **/
    protected Gerenciador gerenciadorSeguinte;

    /** Getters/Setters **/
    public Gerenciador getGerenciadorSeguinte(){
        return this.gerenciadorSeguinte;
    }

    public void setGerenciadorSeguinte(Gerenciador gerenciador){
        this.gerenciadorSeguinte = gerenciador;
    }

    /** Methods **/
    public abstract void verificar(Mail mail);
}
