package com.projeto.sistema.escolar.models.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Table(name = "disciplinas")
@Entity
public class Disciplina {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "carga_horaria", nullable = false)
    private int cargaHoraria;

    @Column(name = "ementa", nullable = false)
    private String ementa;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "nivel", nullable = false)
    private String nivel;

    @ManyToMany
    @JoinTable(name = "disciplina_professor",
            joinColumns = @JoinColumn(name = "disciplina_id"),
            inverseJoinColumns = @JoinColumn(name = "professor_fk"))
    private List<Professor> professor;

    @ManyToMany(mappedBy = "disciplinas")
    private List<Turma> turma;

}
