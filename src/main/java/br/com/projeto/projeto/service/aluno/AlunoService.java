package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.exceptions.CustomExceptions;
import br.com.projeto.projeto.model.Aluno;
import br.com.projeto.projeto.repository.AlunoResopitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService implements IAlunoService{

    @Autowired
    private AlunoResopitory ao;

    @Override
    public List<Aluno> retornaTudo() {
        return  ao.findAll() ;
    }

    @Override
    public Aluno retornaPorId(Integer id) {
        return ao.findById(id).orElseThrow(() -> new CustomExceptions("erro aq"));
    }
}
