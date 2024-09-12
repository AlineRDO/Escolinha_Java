package com.escolinha.saudealunos.models;

import javax.persistence.*;

@Entity
public class Desenvolvimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private String notas;
    private String avaliacoesFisicas;
    private String atividadesExtracurriculares;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public String getAvaliacoesFisicas() {
        return avaliacoesFisicas;
    }

    public void setAvaliacoesFisicas(String avaliacoesFisicas) {
        this.avaliacoesFisicas = avaliacoesFisicas;
    }

    public String getAtividadesExtracurriculares() {
        return atividadesExtracurriculares;
    }

    public void setAtividadesExtracurriculares(String atividadesExtracurriculares) {
        this.atividadesExtracurriculares = atividadesExtracurriculares;
    }
}
