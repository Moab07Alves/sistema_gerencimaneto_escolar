package com.projeto.sistema.escolar.controller;

import com.projeto.sistema.escolar.model.dto.AlunoInputDTO;
import com.projeto.sistema.escolar.model.dto.AlunoOutputDTO;
import com.projeto.sistema.escolar.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    public AlunoService service;

    @PostMapping("/cadastrar")
    public AlunoOutputDTO cadastrarAluno(@RequestBody AlunoInputDTO alunoInputDTO) {
        return service.cadastrar(alunoInputDTO);
    }

}
