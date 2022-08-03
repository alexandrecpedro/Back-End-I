package Colmeia_Company_Responsabilities;

// Define how app works
public class CheckMail {
    /** Attribute **/
    Gerenciador inicial;

    /** Constructor **/
    public CheckMail() {
        this.inicial = new GerenciadorGerencia();
        Gerenciador tecnica = new GerenciadorTecnico();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setGerenciadorSeguinte(comercial);
        comercial.setGerenciadorSeguinte(tecnica);
        tecnica.setGerenciadorSeguinte(spam);
    }

    /** Method **/
    public void verificar(Mail email){
        inicial.verificar(email);
    }
}
