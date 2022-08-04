package Vaccination.model;

import Vaccination.service.ServicoVacinarProxy;
import Vaccination.service.Vacinar;
import org.junit.jupiter.api.Test;

import java.util.Date;

class PessoaTest {
    Date dataVac = new Date();

    @Test
    public void vac() {
        Pessoa p1 = new Pessoa("Christh", "Teixeira", "1122334455", "Pfizer", dataVac);
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(p1.getRg(), p1.getDataVacina(), p1.getNomeVacina());
        System.out.println(p1.toString());
    }

}