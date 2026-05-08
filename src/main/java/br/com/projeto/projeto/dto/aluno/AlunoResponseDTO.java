package br.com.projeto.projeto.dto.aluno;

import br.com.projeto.projeto.model.Matricula;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class AlunoResponseDTO {

    @JsonIgnore
    private Integer  idResponse;
    private String nome;
    private Boolean ativo;


}
