package com.example.people.model;

import javax.persistence.*;

@Entity
@Table(name = "Person")
@IdClass(value = PersonKey.class)
public class Person {
    /** Attributes **/
    @Id
    private Integer cpf;
    @Id
    private Integer identity;

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
}
