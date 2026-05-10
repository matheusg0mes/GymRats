package br.com.projeto.projeto.service.aluno;

import br.com.projeto.projeto.dto.aluno.AlunoAtualizacaoDto;
import br.com.projeto.projeto.dto.aluno.AlunoRequestComIdDTO;
import br.com.projeto.projeto.dto.aluno.AlunoRequestDTO;
import br.com.projeto.projeto.dto.aluno.AlunoResponseDTO;
import br.com.projeto.projeto.exceptions.CustomExceptions;
import br.com.projeto.projeto.mapper.AlunoMapper;
import br.com.projeto.projeto.model.Aluno;
import br.com.projeto.projeto.repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService implements IAlunoService {

    private final AlunoRepository ao;
    private final AlunoMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public List<AlunoResponseDTO> retornaTudo() {
        List<Aluno> aluno = ao.findAll();
        return mapper.listaDeAlunoParaDto(aluno);
    }

    @Override
    @Transactional(readOnly = true)
    public AlunoResponseDTO retornaPorId(Integer id) {
        Aluno aluno = ao.findById(id).orElseThrow(() -> new CustomExceptions("Aluno com o id " + id + " não existe"));
        return mapper.alunoParaDto(aluno);
    }

    @Override
    @Transactional
    public AlunoResponseDTO cadastrarAluno(AlunoRequestDTO aluno) {
        Aluno convert = mapper.dtoSemIdParaEntidade(aluno);
        convert = ao.save(convert);
        return mapper.alunoParaDto(convert);
    }

    @Override
    @Transactional
    public AlunoAtualizacaoDto atualizarAluno(AlunoRequestComIdDTO aluno) {
        Aluno verificar = ao.findById(aluno.getIdaluno()).orElseThrow(() -> new CustomExceptions("O id " + aluno.getIdaluno() + " Não existe"));

        if (!verificar.getEmail().equals(aluno.getEmail())) {
            throw new CustomExceptions("Email não está correto");
        }

        verificar.setAtivo(aluno.getAtivo());
        verificar.setNome(aluno.getNome());
        verificar.setEmail(aluno.getEmail());
        verificar.setTelefone(aluno.getTelefone());
        verificar.setIdaluno(aluno.getIdaluno());
        return mapper.alunoParaDtoAtualizacao(ao.save(verificar));
    }

    @Override
    @Transactional
    public void deletaAluno(Integer id) {
        Aluno verifica = ao.findById(id).orElseThrow(() -> new CustomExceptions("Esse id Não existe"));
        ao.deleteById(verifica.getIdaluno());
    }
}
