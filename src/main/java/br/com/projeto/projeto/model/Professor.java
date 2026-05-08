package br.com.projeto.projeto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "professor")
@Getter
@Setter
@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idprofessor;

    @Column(name = "nome", length = 45, nullable = false)
    private String nome;

    @Column(name = "email", length = 45, nullable = false, unique = true)
    private String email;

    @Column(name = "especializacao", length = 45, nullable = false)
    private String especializacao;

}
