package br.com.projeto.projeto.mapper;

import br.com.projeto.projeto.dto.aluno.AlunoAtualizacaoDto;
import br.com.projeto.projeto.dto.aluno.AlunoRequestComIdDTO;
import br.com.projeto.projeto.dto.aluno.AlunoRequestDTO;
import br.com.projeto.projeto.dto.aluno.AlunoResponseDTO;
import br.com.projeto.projeto.model.Aluno;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlunoMapper {

    AlunoResponseDTO alunoParaDto(Aluno aluno);

    Aluno dtoSemIdParaEntidade(AlunoRequestDTO aluno);

    List<AlunoResponseDTO> listaDeAlunoParaDto(List<Aluno> aluno);

    Aluno dtoComIdParaEntidade(AlunoRequestComIdDTO aluno);

    AlunoAtualizacaoDto alunoParaDtoAtualizacao(Aluno aluno);
}
