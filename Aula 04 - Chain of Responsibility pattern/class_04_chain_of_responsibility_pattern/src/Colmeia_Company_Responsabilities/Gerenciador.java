package Colmeia_Company_Responsabilities;

public abstract class Gerenciador {
//    Attributes
    protected Gerenciador gerenciadorSeguinte;

//    Methods
    public Gerenciador getSeguinte(){
        return this.gerenciadorSeguinte;
    }

    public void setSeguinte(Gerenciador gerenciador){
        this.gerenciadorSeguinte = gerenciador;
    }

    public abstract void verificar(Mail mail);
}
