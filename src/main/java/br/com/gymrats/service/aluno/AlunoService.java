package br.com.gymrats.service.aluno;

import br.com.gymrats.dto.aluno.AlunoAtualizacaoDto;
import br.com.gymrats.dto.aluno.AlunoRequestComIdDTO;
import br.com.gymrats.dto.aluno.AlunoRequestDTO;
import br.com.gymrats.dto.aluno.AlunoResponseDTO;
import br.com.gymrats.exceptions.CustomExceptions;
import br.com.gymrats.mapper.AlunoMapper;
import br.com.gymrats.model.Aluno;
import br.com.gymrats.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService implements IAlunoService {

    private final AlunoRepository repository;
    private final AlunoMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public List<AlunoResponseDTO> retornaTudo() {
        List<Aluno> aluno = repository.findAll();
        return mapper.listaDeAlunoParaDto(aluno);
    }

    @Override
    @Transactional(readOnly = true)
    public AlunoResponseDTO retornaPorId(Integer id) {
        Aluno aluno = repository.findById(id).orElseThrow(() -> new CustomExceptions("Aluno com o id " + id + " não existe"));
        return mapper.alunoParaDto(aluno);
    }

    @Override
    @Transactional
    public AlunoResponseDTO cadastrarAluno(AlunoRequestDTO aluno) {
        Aluno convert = mapper.dtoSemIdParaEntidade(aluno);
        convert = repository.save(convert);
        return mapper.alunoParaDto(convert);
    }

    @Override
    @Transactional
    public AlunoAtualizacaoDto atualizarAluno(AlunoRequestComIdDTO aluno) {
        Aluno verificar = repository.findById(aluno.getIdaluno()).orElseThrow(() -> new CustomExceptions("O id " + aluno.getIdaluno() + " Não existe"));

        if (!verificar.getEmail().equals(aluno.getEmail())) {
            throw new CustomExceptions("Email não está correto");
        }

        verificar.setAtivo(aluno.getAtivo());
        verificar.setNome(aluno.getNome());
        verificar.setEmail(aluno.getEmail());
        verificar.setTelefone(aluno.getTelefone());
        verificar.setIdaluno(aluno.getIdaluno());
        return mapper.alunoParaDtoAtualizacao(repository.save(verificar));
    }

    @Override
    @Transactional
    public void deletaAluno(Integer id) {
        Aluno verifica = repository.findById(id).orElseThrow(() -> new CustomExceptions("Esse id Não existe"));
        repository.deleteById(verifica.getIdaluno());
    }
}
