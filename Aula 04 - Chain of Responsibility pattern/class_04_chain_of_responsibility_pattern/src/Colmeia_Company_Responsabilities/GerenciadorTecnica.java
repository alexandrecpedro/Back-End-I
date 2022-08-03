package Colmeia_Company_Responsabilities;

public class GerenciadorTecnica extends Gerenciador {

//    Method
    @Override
    public void verificar(Mail email) {
        if((email.getDestino().equalsIgnoreCase("tecnica@colmeia.com")) || (email.getAssunto().equalsIgnoreCase("Técnica"))) {
            System.out.println("Enviado ao Departamento Técnico");
        } else {
            if(this.getSeguinte() != null) {
                this.getSeguinte().verificar(email);
            }
        }
    }
}
