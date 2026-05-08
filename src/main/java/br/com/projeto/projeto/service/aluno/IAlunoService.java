package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.dto.aluno.AlunoRequestDTO;
import br.com.projeto.projeto.dto.aluno.AlunoResponseDTO;

import java.util.List;

public interface IAlunoService {

    public List<AlunoResponseDTO> retornaTudo();
    public AlunoResponseDTO retornaPorId(Integer id);
    public AlunoResponseDTO cadastrarAluno(AlunoRequestDTO aluno);
}
