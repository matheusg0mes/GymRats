package br.com.projeto.projeto.repository;

import br.com.projeto.projeto.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoResopitory extends JpaRepository<Aluno, Integer> {

}
