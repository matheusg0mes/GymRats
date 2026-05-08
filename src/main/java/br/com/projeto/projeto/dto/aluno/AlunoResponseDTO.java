package br.com.projeto.projeto.dto.aluno;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AlunoResponseDTO {


    private String nome;
    private Boolean ativo;


}
