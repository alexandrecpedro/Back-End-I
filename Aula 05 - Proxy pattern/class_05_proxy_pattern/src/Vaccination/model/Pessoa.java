package Vaccination.model;

import java.util.Date;

public class Pessoa {
    /** Attributes **/
    private String nome, sobrenome, rg, nomeVacina;
    private Date dataVacina;

    /** Constructor **/
    public Pessoa(String nome, String sobrenome, String rg, String nomeVacina, Date dataVacina) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.nomeVacina = nomeVacina;
        this.dataVacina = dataVacina;
    }

    /** Getters/Setters **/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public Date getDataVacina() {
        return dataVacina;
    }

    public void setDataVacina(Date dataVacina) {
        this.dataVacina = dataVacina;
    }

    /** toString **/
    @Override
    public String toString() {
        return "Pessoa" +
                "\nnome = " + nome +
                "\nsobrenome = " + sobrenome +
                "\nrg = " + rg +
                "\nnomeVacina = " + nomeVacina +
                "\ndataVacina = " + dataVacina;
    }
}
