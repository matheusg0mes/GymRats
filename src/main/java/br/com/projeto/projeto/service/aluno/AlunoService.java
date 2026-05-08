package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.dto.aluno.AlunoRequestDTO;
import br.com.projeto.projeto.dto.aluno.AlunoResponseDTO;
import br.com.projeto.projeto.exceptions.CustomExceptions;
import br.com.projeto.projeto.mapper.AlunoMapper;
import br.com.projeto.projeto.model.Aluno;
import br.com.projeto.projeto.repository.AlunoResopitory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService implements IAlunoService{

    private final AlunoResopitory ao;
    private final AlunoMapper mapper;

    @Override
    public List<AlunoResponseDTO> retornaTudo() {
        List<Aluno> aluno =  ao.findAll() ;
        return mapper.toListDtoo(aluno);
    }

    @Override
    public AlunoResponseDTO retornaPorId(Integer id) {
        Aluno aluno =  ao.findById(id).orElseThrow(() -> new CustomExceptions("erro aq"));
        return mapper.toDTO(aluno);
    }

    @Override
    public AlunoResponseDTO cadastrarAluno(AlunoRequestDTO aluno) {
         Aluno convert = mapper.paraEntityDeRequest(aluno);
            convert = ao.save(convert);
        AlunoResponseDTO response = mapper.toDTO(convert);
            return response;
    }
}
