package Colmeia_Company_Responsabilities;

public class GerenciadorGerencia extends Gerenciador {

    /** Method **/
    @Override
    public void verificar(Mail email) {
        if (email.getDestino().equalsIgnoreCase("gerencia@colmeia.com") ||
                email.getAssunto().equalsIgnoreCase("Gerência") ||
                email.getAssunto().equalsIgnoreCase("Gerencia")) {
            System.out.println("Enviado ao Departamento Gerencial");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}
