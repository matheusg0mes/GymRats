package br.com.projeto.projeto.mapper;

import br.com.projeto.projeto.dto.aluno.AlunoRequestDTO;
import br.com.projeto.projeto.dto.aluno.AlunoResponseDTO;
import br.com.projeto.projeto.model.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel ="spring")
public interface AlunoMapper {

    @Mapping(source = "idAluno", target ="idResponse")
    AlunoResponseDTO toDTO(Aluno aluno);

    @Mapping(source = "idRequest" , target = "idAluno")
    Aluno paraEntityDeRequest(AlunoRequestDTO aluno);

    @Mapping(source = "idResponse", target = "idAluno")
    Aluno toEntitu(AlunoResponseDTO dto);

    @Mapping(source = "idaluno", target ="id")
    List<AlunoResponseDTO> toListDtoo(List<Aluno> aluno);
}
