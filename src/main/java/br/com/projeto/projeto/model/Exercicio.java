package br.com.projeto.projeto.model;

import jakarta.persistence.*;

@Entity
@Table(name="exercicio")
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="nome", nullable = false,length = 45)
    private String nome;

    @Column(name="descricao", nullable = false,length = 45)
    private String descricao;

    @Column(name="serie", nullable = false,length = 45)
    private String serie;

    @Column(name="repeticao", nullable = false,length = 45)
    private String repeticao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(String repeticao) {
        this.repeticao = repeticao;
    }
}
