package br.com.gymrats.service.aluno;

import br.com.gymrats.dto.aluno.AlunoAtualizacaoDto;
import br.com.gymrats.dto.aluno.AlunoRequestComIdDTO;
import br.com.gymrats.dto.aluno.AlunoRequestDTO;
import br.com.gymrats.dto.aluno.AlunoResponseDTO;

import java.util.List;

public interface IAlunoService {

    public List<AlunoResponseDTO> retornaTudo();

    public AlunoResponseDTO retornaPorId(Integer id);

    public AlunoResponseDTO cadastrarAluno(AlunoRequestDTO aluno);

    public AlunoAtualizacaoDto atualizarAluno(AlunoRequestComIdDTO aluno);

    public void deletaAluno(Integer id);
}
