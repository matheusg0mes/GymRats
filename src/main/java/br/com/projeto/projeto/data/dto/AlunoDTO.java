package br.com.projeto.projeto.data.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AlunoDTO {

    private Integer  idaluno;
    private String nome;
    private Boolean ativo;

    public Integer getId() {
        return  idaluno;
    }

    public void setId(Integer id) {
        this. idaluno = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}


