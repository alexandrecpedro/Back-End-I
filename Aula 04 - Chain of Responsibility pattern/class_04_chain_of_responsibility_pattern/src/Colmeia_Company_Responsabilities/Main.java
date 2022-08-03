package Colmeia_Company_Responsabilities;

public class Main {
    public static void main(String[] args) {
        CheckMail verificaMail = new CheckMail();

        verificaMail.verificar(
                new Mail("email@email.com",
                "tecnica@dh.com.br",
                "Reclamação"));

        verificaMail.verificar(
                new Mail("email@email.com",
                        "sds@dh.com.br",
                        "Gerência"));

        verificaMail.verificar(
                new Mail("email@email.com",
                "cris@dh.com.br",
                "Comercial"));

        verificaMail.verificar(
                new Mail("email@email.com",
                        "tecnica@colmeia.com",
                        "Quero meu iate"));
    }
}
