package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.dto.AlunoDTO;

import java.util.List;

public interface IAlunoService {

    public List<AlunoDTO> retornaTudo();
    public AlunoDTO retornaPorId(Integer id);
}
