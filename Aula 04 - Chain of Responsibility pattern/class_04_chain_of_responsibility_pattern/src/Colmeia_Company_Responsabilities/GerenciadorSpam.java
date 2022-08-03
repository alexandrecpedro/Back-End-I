package Colmeia_Company_Responsabilities;

public class GerenciadorSpam extends Gerenciador {

    /** Method **/
    @Override
    public void verificar(Mail email) {
        System.out.println("Cai fora: SPAM!");
    }
}
