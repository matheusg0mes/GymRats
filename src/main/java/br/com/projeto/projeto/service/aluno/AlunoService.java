package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.dto.AlunoDTO;
import br.com.projeto.projeto.exceptions.CustomExceptions;
import br.com.projeto.projeto.mapper.AlunoMapper;
import br.com.projeto.projeto.model.Aluno;
import br.com.projeto.projeto.repository.AlunoResopitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService implements IAlunoService{

    @Autowired
    private AlunoResopitory ao;
    @Autowired
    private AlunoMapper mapper;

    @Override
    public List<AlunoDTO> retornaTudo() {
        List<Aluno> aluno =  ao.findAll() ;
        return mapper.toListDtoo(aluno);
    }

    @Override
    public AlunoDTO retornaPorId(Integer id) {
        Aluno aluno =  ao.findById(id).orElseThrow(() -> new CustomExceptions("erro aq"));
        return mapper.toDTO(aluno);

    }
}
