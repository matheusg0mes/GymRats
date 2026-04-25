package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.data.dto.AlunoDTO;
import br.com.projeto.projeto.model.Aluno;

import java.util.List;

public interface IAlunoService {

    public List<AlunoDTO> retornaTudo();
    public AlunoDTO retornaPorId(Integer id);
}
