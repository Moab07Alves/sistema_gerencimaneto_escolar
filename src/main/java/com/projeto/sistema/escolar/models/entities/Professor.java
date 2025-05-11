package com.projeto.sistema.escolar.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.sistema.escolar.models.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Table(name = "professores")
@Entity
public class Professor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", unique = true, nullable = false, length = 11)
    private String cpf;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "formacao", nullable = false)
    private String formacao;

    @Column(name = "especializacao", nullable = false)
    private String especializacao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_contratacao", nullable = false)
    private LocalDate dataContratacao;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @ManyToMany(mappedBy = "professor")
    private List<Disciplina> disciplinas;

    @ManyToMany(mappedBy = "professores")
    private List<Turma> turmas;

}
