package br.com.projeto.projeto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "")
@Getter
@Setter
@NoArgsConstructor
public class Treino {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtreino;

    @Column(name = "nome", nullable = false, length = 45)
    private String nome;

    @Column(name = "nivel")
    private Integer nivel;

    @ManyToOne
    @JoinColumn(name = "professor_idprofessor")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "exercicio_idexercicio")
    private Exercicio exercicio;

}
