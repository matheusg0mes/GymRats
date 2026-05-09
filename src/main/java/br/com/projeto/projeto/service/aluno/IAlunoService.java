package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.dto.aluno.AlunoAtualizacaoDto;
import br.com.projeto.projeto.dto.aluno.AlunoRequestComIdDTO;
import br.com.projeto.projeto.dto.aluno.AlunoRequestDTO;
import br.com.projeto.projeto.dto.aluno.AlunoResponseDTO;

import java.util.List;

public interface IAlunoService {

    public List<AlunoResponseDTO> retornaTudo();

    public AlunoResponseDTO retornaPorId(Integer id);

    public AlunoResponseDTO cadastrarAluno(AlunoRequestDTO aluno);

    public AlunoAtualizacaoDto atualizarAluno(AlunoRequestComIdDTO aluno);

    public void deletaAluno(Integer id);
}
