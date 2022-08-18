package HotelGroup.filial.model;

import java.util.Objects;

public class Filial {
    /** Attributes **/
    private Integer id;
    private String nomeFilial, logradouro, numero, cidade, estado;
    private Boolean e5Estrelas;

    /** Constructor **/
    public Filial(String nomeFilial, String logradouro, String numero, String cidade, String estado, Boolean e5Estrelas) {
        this.nomeFilial = nomeFilial;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.e5Estrelas = e5Estrelas;
    }

    public Filial(Integer id, String nomeFilial, String logradouro, String numero, String cidade, String estado, Boolean e5Estrelas) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.e5Estrelas = e5Estrelas;
    }

    /** Getters/Setters **/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getE5Estrelas() {
        return e5Estrelas;
    }

    public void setE5Estrelas(Boolean e5Estrelas) {
        this.e5Estrelas = e5Estrelas;
    }

    /** Methods **/
    @Override
    public String toString() {
        return "Filial {" +
                " nomeFilial = " + nomeFilial +
                " | logradouro = " + logradouro +
                " | numero = " + numero +
                " | cidade = " + cidade +
                " | estado = " + estado +
                " | e5Estrelas = " + e5Estrelas +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filial filial = (Filial) o;
        return id.equals(filial.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
