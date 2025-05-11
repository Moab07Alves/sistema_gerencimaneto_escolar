package com.projeto.sistema.escolar.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.sistema.escolar.models.enums.Sexo;
import com.projeto.sistema.escolar.models.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Table(name = "alunos")
@Entity
public class Aluno {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    private Sexo sexo;

    @Column(name = "cpf", nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone", length = 11)
    private String telefone;

    @Column(name = "nome_responsavel", nullable = false)
    private String nomeResponsavel;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_matricula", nullable = false)
    private LocalDate dataMatricula;

    @OneToOne
    @JoinColumn(name = "endereco_fk")
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "turma_fk")
    private Turma turma;

}
