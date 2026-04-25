package br.com.projeto.projeto.model;

import jakarta.persistence.*;

@Entity
@Table(name="professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome", length = 45,nullable = false)
    private String nome;

    @Column(name="email", length = 45,nullable = false, unique = true)
    private String email;

    @Column(name="especializacao", length = 45,nullable = false)
    private String especializacao;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
