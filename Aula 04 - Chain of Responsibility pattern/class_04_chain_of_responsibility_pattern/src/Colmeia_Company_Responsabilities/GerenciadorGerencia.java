package Colmeia_Company_Responsabilities;

public class GerenciadorGerencia extends Gerenciador {

//    Method
    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("gerencia@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Gerência"))) {
            System.out.println("Enviado ao Departamento Gerencial");
        } else {
            if(this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
    }
}
