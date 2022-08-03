package Colmeia_Company_Responsabilities;

public class CheckMail {
//    Attribute
    Gerenciador inicial;

//    Constructor
    public CheckMail() {
        this.inicial = new GerenciadorGerencia();
        Gerenciador tecnica = new GerenciadorTecnica();
        Gerenciador comercial = new GerenciadorComercial();
        Gerenciador spam = new GerenciadorSpam();

        inicial.setSeguinte(comercial);
        comercial.setSeguinte(tecnica);
        tecnica.setSeguinte(spam);
    }

//    Method
    public void verificar(Mail email){
        inicial.verificar(email);
    }
}
