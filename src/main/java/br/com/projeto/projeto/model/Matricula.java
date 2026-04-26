package br.com.projeto.projeto.model;

import br.com.projeto.projeto.enums.StatusMatricula;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="matricula")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "status",nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusMatricula statusMatricula;

    @Column(name="dataInicio")
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name= "aluno_idaluno")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name ="plano_idplano")
    private Plano plano;

    @OneToMany(mappedBy = "matricula")
    private List<Pagamento> pagamentos;

    public StatusMatricula getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(StatusMatricula statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public List<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StatusMatricula getStatus() {
        return statusMatricula;
    }

    public void setStatus(StatusMatricula statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
