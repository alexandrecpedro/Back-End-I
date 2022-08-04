package Vaccination.service;

import java.util.Date;

public interface Vacinar {
    void vacinarPessoa(String rg, Date dataVacina, String tipoVacina);
}
