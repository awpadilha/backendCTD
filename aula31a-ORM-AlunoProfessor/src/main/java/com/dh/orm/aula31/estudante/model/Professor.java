package com.dh.orm.aula31.estudante.model;

import javax.persistence.*;
import java.util.*;


@Entity
@Table
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer nome;
    private Integer curso;
    @OneToMany(mappedBy = "professor", fetch = FetchType.LAZY)
    private Set<Aluno> alunos = new HashSet<>();

    public Professor() {
    }
}