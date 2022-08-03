package Colmeia_Company_Responsabilities;

public class GerenciadorComercial extends Gerenciador {

//    Method
    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("comercial@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Comercial"))) {
            System.out.println("Enviado ao Departamento Comercial");
        } else {
            if(this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
    }
}
