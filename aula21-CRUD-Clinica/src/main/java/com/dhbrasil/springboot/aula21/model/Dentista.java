package com.dhbrasil.springboot.aula21.model;

public class Dentista {

    private Integer id;
    private String nome;
    private String sobreNome;
    private Integer matricula;

    public Dentista() {
    }

    public Dentista(Integer id, String nome, String sobreNome, Integer matricula) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.matricula = matricula;
    }

    public Dentista(String nome, String sobreNome, Integer matricula) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.matricula = matricula;
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

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
