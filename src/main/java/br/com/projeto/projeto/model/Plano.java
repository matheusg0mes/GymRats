package br.com.projeto.projeto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "plano")
@Getter
@Setter
@NoArgsConstructor
public class Plano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idplano;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "valor", nullable = false)
    private Double preco;

    @Column(name = "descricao", length = 100)
    private String descricao;

}
