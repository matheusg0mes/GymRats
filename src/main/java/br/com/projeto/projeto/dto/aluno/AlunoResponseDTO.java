package br.com.projeto.projeto.dto.aluno;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AlunoResponseDTO {

    private String nome;

    private String email;

    private Boolean ativo;

}
