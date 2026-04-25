package br.com.projeto.projeto.mapper;

import br.com.projeto.projeto.data.dto.AlunoDTO;
import br.com.projeto.projeto.model.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel ="spring")
public interface AlunoMapper {

    @Mapping(source = "idAluno", target ="id")
    AlunoDTO toDTO(Aluno aluno);

    @Mapping(source = "id", target = "idAluno")
    Aluno toEntitu(AlunoDTO dto);

    @Mapping(source = "idaluno", target ="id")
    List<AlunoDTO> toListDtoo(List<Aluno> aluno);
}
