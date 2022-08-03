package Colmeia_Company_Responsabilities;

public class GerenciadorTecnico extends Gerenciador {
    /** Method **/
    @Override
    public void verificar(Mail email) {
        if (email.getDestino().equalsIgnoreCase("tecnica@colmeia.com") ||
                email.getAssunto().equalsIgnoreCase("Técnico") ||
                email.getAssunto().equalsIgnoreCase("Tecnico")) {
            System.out.println("Enviado ao Departamento Técnico");
        } else {
            if (this.getGerenciadorSeguinte() != null) {
                this.getGerenciadorSeguinte().verificar(email);
            }
        }
    }
}
