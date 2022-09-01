package com.example.people.model;

import java.io.Serializable;
import java.util.Objects;

public class PersonKey implements Serializable {
    /** Attributes **/
    private Integer cpf, identity;

    /** Getters/Setters **/
    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }

    /** Methods **/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonKey personKey = (PersonKey) o;
        return Objects.equals(cpf, personKey.cpf) && Objects.equals(identity, personKey.identity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, identity);
    }
}
