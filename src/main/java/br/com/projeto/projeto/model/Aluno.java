package br.com.projeto.projeto.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer  idaluno;

    @Column(name = "nome", length = 45,nullable = false)
    private String nome;

    @Column(name = "email", length = 45,nullable = false)
    private String email;

    @Column(name = "telefone", length = 45, nullable = false)
    private String telefone;

    @Column(name = "ativo")
    private Boolean ativo;

    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matricula;

    public Integer getIdAluno() {
        return  idaluno;
    }

    public void setIdAluno(Integer id) {
        this. idaluno = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
