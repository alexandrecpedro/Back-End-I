package DentistClinic.model;

import java.time.LocalDate;

public class Patient {
    /** Attributes **/
    private Long id;
    private String nome, sobrenome;
    private Long rg;
    private LocalDate dataCadastro;
    private Address address;

    /** Constructor **/
    public Patient() {
    }

    public Patient(String nome, String sobrenome, Long rg, LocalDate dataCadastro, Address address) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
        this.address = address;
    }

    /** Getters/Setters **/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Long getRg() {
        return rg;
    }

    public void setRg(Long rg) {
        this.rg = rg;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
                ", address=" + address +
                '}';
    }
}
