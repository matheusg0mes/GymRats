package br.com.projeto.projeto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="exercicio")
@Getter
@Setter
@NoArgsConstructor
public class Exercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idexercicio;

    @Column(name="nome", nullable = false,length = 45)
    private String nome;

    @Column(name="descricao", nullable = false,length = 45)
    private String descricao;

    @Column(name="serie", nullable = false,length = 45)
    private String serie;

    @Column(name="repeticao", nullable = false,length = 45)
    private String repeticao;


}
