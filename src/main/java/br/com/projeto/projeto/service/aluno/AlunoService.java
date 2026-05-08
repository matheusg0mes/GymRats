package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.dto.aluno.AlunoRequestDTO;
import br.com.projeto.projeto.dto.aluno.AlunoResponseDTO;
import br.com.projeto.projeto.exceptions.CustomExceptions;
import br.com.projeto.projeto.mapper.AlunoMapper;
import br.com.projeto.projeto.model.Aluno;
import br.com.projeto.projeto.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService implements IAlunoService {

    private final AlunoRepository ao;
    private final AlunoMapper mapper;

    @Override
    public List<AlunoResponseDTO> retornaTudo() {
        List<Aluno> aluno = ao.findAll();
        return mapper.listaDeAlunoParaDto(aluno);
    }

    @Override
    public AlunoResponseDTO retornaPorId(Integer id) {
        Aluno aluno = ao.findById(id).orElseThrow(() -> new CustomExceptions("erro aq"));
        return mapper.alunoParaDto(aluno);
    }

    @Override
    public AlunoResponseDTO cadastrarAluno(AlunoRequestDTO aluno) {
        Aluno convert = mapper.dtoParaEntidade(aluno);
        convert = ao.save(convert);
        AlunoResponseDTO response = mapper.alunoParaDto(convert);
        return response;
    }
}
