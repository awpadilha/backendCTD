package com.dh.aula32.integradorax.model;

import javax.persistence.*;

@Entity
@Table
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer nome;
    private Integer quantidade;
    private Integer descrição;

    public Produto() {
    }

    public Produto(Integer id, Integer nome, Integer quantidade, Integer descrição) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.descrição = descrição;
    }

    public Produto(Integer nome, Integer quantidade, Integer descrição) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.descrição = descrição;
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getDescrição() {
        return descrição;
    }

    public void setDescrição(Integer descrição) {
        this.descrição = descrição;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome=" + nome +
                ", quantidade=" + quantidade +
                ", descrição=" + descrição +
                '}';
    }
}
