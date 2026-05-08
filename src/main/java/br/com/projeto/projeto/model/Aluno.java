package br.com.projeto.projeto.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "aluno")
@Getter
@Setter
@NoArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idaluno;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "email", length = 45, nullable = false)
    private String email;

    @Column(name = "telefone", length = 45, nullable = false)
    private String telefone;

    @Column(name = "ativo")
    private Boolean ativo;

    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matricula;

}
