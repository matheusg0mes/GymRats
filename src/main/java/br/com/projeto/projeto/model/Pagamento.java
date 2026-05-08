package br.com.projeto.projeto.model;

import br.com.projeto.projeto.enums.StatusPagamento;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "pagamento")
@Getter
@Setter
@NoArgsConstructor
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idpagamento;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Column(name = "data_pagar", nullable = false)
    private LocalDate data;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusPagamento status;

    @ManyToOne
    @JoinColumn(name = "matricula_idmatricula")
    private Matricula matricula;

}
