package com.dh.orm.aula31.estudante.model;

import javax.persistence.*;

@Entity
@Table
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer nome;
    private Integer sobrenome;
    private Integer email;

    public Estudante() {
    }

    public Estudante(Integer id, Integer nome, Integer sobrenome, Integer email) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public Estudante(Integer nome, Integer sobrenome, Integer email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }

    public Integer getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(Integer sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }
}
