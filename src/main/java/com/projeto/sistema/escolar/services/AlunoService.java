package com.projeto.sistema.escolar.services;

import com.projeto.sistema.escolar.mapper.AlunoMapper;
import com.projeto.sistema.escolar.model.dto.AlunoInputDTO;
import com.projeto.sistema.escolar.model.dto.AlunoOutputDTO;
import com.projeto.sistema.escolar.model.entity.Aluno;
import com.projeto.sistema.escolar.repository.AlunoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
public class AlunoService {

    private final AlunoRepository repository;
    private final AlunoMapper mapper;

    public AlunoService(AlunoRepository repository, AlunoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional(readOnly = false)
    public AlunoOutputDTO cadastrar(AlunoInputDTO alunoInputDTO) {
        Aluno aluno = mapper.toEntity(alunoInputDTO);
        repository.save(aluno);
        return mapper.toDTO(aluno);
    }



}
