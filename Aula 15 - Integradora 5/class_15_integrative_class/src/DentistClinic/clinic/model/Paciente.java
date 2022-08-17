package DentistClinic.clinic.model;

import java.time.LocalDate;

public class Paciente {
    /** Attributes **/
    private Integer id;
    private String nome, sobrenome, rg;
    private LocalDate dataCadastro;
    private Endereco endereco;

    /** Constructor **/
    public Paciente() {
    }

    public Paciente(String nome, String sobrenome, String rg, LocalDate dataCadastro, Endereco endereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
    }

    public Paciente(Integer id, String nome, String sobrenome, String rg, LocalDate dataCadastro, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
        this.endereco = endereco;
    }

    /** Getters/Setters **/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Endereco getAddress() {
        return endereco;
    }

    public void setAddress(Endereco endereco) {
        this.endereco = endereco;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", rg=" + rg +
                ", dataCadastro=" + dataCadastro +
                ", address=" + endereco +
                '}';
    }
}