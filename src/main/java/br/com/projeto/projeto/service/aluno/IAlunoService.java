package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.model.Aluno;

import java.util.List;

public interface IAlunoService {

    public List<Aluno> retornaTudo();
    public Aluno retornaPorId(Integer id);
}
