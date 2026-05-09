package br.com.projeto.projeto.dto.aluno;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AlunoAtualizacaoDto {

    private Integer idaluno;

    private String nome;

    private String email;

    private String telefone;

    private Boolean ativo;
}
