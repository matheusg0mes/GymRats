package br.com.gymrats.model;

import br.com.gymrats.enums.StatusMatricula;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "matricula")
@Getter
@Setter
@NoArgsConstructor
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idmatricula;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusMatricula statusMatricula;

    @Column(name = "dataInicio")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "aluno_idaluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "plano_idplano")
    private Plano plano;

    @OneToMany(mappedBy = "matricula")
    private List<Pagamento> pagamentos;

}
