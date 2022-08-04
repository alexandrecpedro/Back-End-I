package Vaccination.service;

import java.util.Date;

public class ServicoVacinarProxy implements Vacinar {
    /** Method **/
    @Override
    public void vacinarPessoa(String rg, Date dataVacina, String tipoVacina) {
        if (dataVacina.before(new Date())) {
            ServicoVacinar servicoVacinar = new ServicoVacinar();
            servicoVacinar.vacinarPessoa(rg, dataVacina, tipoVacina);
            System.out.println("Cidadã(o) vacinada(o) com sucesso");
        } else {
            System.out.println("A data de hoje é anterior à data marcada");
        }
    }
}
