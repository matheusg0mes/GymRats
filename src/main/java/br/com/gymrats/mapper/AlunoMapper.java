package br.com.gymrats.mapper;

import br.com.gymrats.dto.aluno.AlunoAtualizacaoDto;
import br.com.gymrats.dto.aluno.AlunoRequestComIdDTO;
import br.com.gymrats.dto.aluno.AlunoRequestDTO;
import br.com.gymrats.dto.aluno.AlunoResponseDTO;
import br.com.gymrats.model.Aluno;
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
