package com.dh.hibernate.aula33.model;

import javax.persistence.*;

@Entity
@Table(name = "tabelajogador")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String posicao;
    private Double peso;
    private Double altura;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_id")
    private Time time;

    public Jogador() {
    }

    public Jogador(Integer id, String nome, String posicao, Double peso, Double altura, Time time) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.peso = peso;
        this.altura = altura;
        this.time = time;
    }

    public Jogador(String nome, String posicao, Double peso, Double altura, Time time) {
        this.nome = nome;
        this.posicao = posicao;
        this.peso = peso;
        this.altura = altura;
        this.time = time;
    }

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

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
