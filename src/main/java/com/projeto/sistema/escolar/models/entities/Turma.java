package com.projeto.sistema.escolar.models.entities;

import com.projeto.sistema.escolar.models.enums.Turno;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Table(name = "turmas")
@Entity
public class Turma {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "ano", nullable = false)
    private int ano;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "turno", nullable = false)
    private Turno turno;

    @Column(name = "sala", nullable = false)
    private String sala;

    @ManyToMany
    @JoinTable(name = "turma_disciplinas",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "disciplina_id"))
    private List<Disciplina> disciplinas;

    @ManyToMany
    @JoinTable(name = "turma_professores",
            joinColumns = @JoinColumn(name = "turma_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_id"))
    private List<Professor> professores;

    @OneToMany(mappedBy = "turma")
    private List<Aluno> alunos;

}
