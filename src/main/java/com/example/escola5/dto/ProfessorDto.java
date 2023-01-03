package com.example.escola5.dto;

import com.example.escola5.persistence.model.Aluno;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Objects;

public class ProfessorDto {

    private Long id;
    private String nome;
    private List<Aluno> alunos;

    public ProfessorDto(String nome, List<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessorDto that = (ProfessorDto) o;
        return Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(alunos, that.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, alunos);
    }

    @Override
    public String toString() {
        return "ProfessorDto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
