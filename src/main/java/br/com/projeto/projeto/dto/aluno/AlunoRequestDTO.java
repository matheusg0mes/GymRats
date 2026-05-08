package br.com.projeto.projeto.dto.aluno;

import br.com.projeto.projeto.model.Matricula;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class AlunoRequestDTO {

    private Integer  idRequest;
    private String nome;
    private String email;
    private String telefone;
    private Boolean ativo;

}
