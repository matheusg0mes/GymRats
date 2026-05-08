package br.com.projeto.projeto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name ="treinar_aluno")
@Getter
@Setter
@NoArgsConstructor
public class Treinamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

   @Column(name = "data",nullable = false)
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "treino_idtreino")
    private Treino treino;

    @ManyToOne
    @JoinColumn(name = "aluno_idaluno")
    private Aluno aluno;

}
