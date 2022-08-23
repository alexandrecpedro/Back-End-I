package DentistClinic.clinic.model;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    /** Attributes **/
    private Integer id;
    private String nome, sobrenome, rg;
    private Date dataCadastro;
    private Integer idEndereco;

    /** Constructor **/
    public Paciente() {
    }

    public Paciente(String nome, String sobrenome, String rg, Date dataCadastro, Integer idEndereco) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
        this.idEndereco = idEndereco;
    }

    public Paciente(Integer id, String nome, String sobrenome, String rg, Date dataCadastro, Integer idEndereco) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.dataCadastro = dataCadastro;
        this.idEndereco = idEndereco;
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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
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
                ", idEndereco=" + idEndereco +
                '}';
    }
}
