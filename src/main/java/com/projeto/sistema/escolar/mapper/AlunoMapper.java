package com.projeto.sistema.escolar.mapper;

import com.projeto.sistema.escolar.model.dto.AlunoInputDTO;
import com.projeto.sistema.escolar.model.dto.AlunoOutputDTO;
import com.projeto.sistema.escolar.model.entity.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AlunoMapper {

    AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);

    Aluno toEntity(AlunoInputDTO alunoInputDTO);
    AlunoOutputDTO toDTO(Aluno aluno);

}
