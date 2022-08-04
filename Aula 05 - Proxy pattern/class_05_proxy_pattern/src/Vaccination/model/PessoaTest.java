package Vaccination.model;

import Vaccination.service.ServicoVacinarProxy;
import Vaccination.service.Vacinar;
import org.junit.jupiter.api.Test;

import java.util.Date;

class PessoaTest {
    Date dataVac = new Date();

    @Test
    public void vac() {
        Pessoa pessoa = new Pessoa("Christh", "Teixeira", "1122334455", "Pfizer", dataVac);
        Vacinar vacinar = new ServicoVacinarProxy();
        vacinar.vacinarPessoa(pessoa.getRg(), pessoa.getDataVacina(), pessoa.getNomeVacina());
        System.out.println(pessoa.toString());
    }

}