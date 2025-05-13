package com.projeto.sistema.escolar.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
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

    public Disciplina(String nome, int cargaHoraria, String ementa, String codigo, String nivel) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ementa = ementa;
        this.codigo = codigo;
        this.nivel = nivel;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<Professor> getProfessor() {
        return professor;
    }

    public void adicionarProfessor(Professor professor) {
        this.professor.add(professor);
    }

    public void removerProfessor() {
        this.professor.remove(professor);
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void adicionarTurma(Turma turma) {
        this.turma.add(turma);
    }

    public void removerTurma(Turma turma) {
        this.turma.remove(turma);
    }

    @Override
    public String toString() {
        StringBuilder turmas = new StringBuilder();
        for(Turma turma : this.turma){
            turmas.append(
                    "Nome: " + turma.getNome() + "/n" +
                            "Ano: " + turma.getAno() + "/n" +
                            "Turno: " + turma.getTurno() + "/n" +
                            "Sala: " + turma.getSala() + "/n"
            );
        }
        StringBuilder professores = new StringBuilder();
        for(Professor professor : this.professor) {
            professores.append(
                    "Nome: " + professor.getNome() + "/n" +
                            "CPF: " + professor.getCpf() + "/n" +
                            "E-mail: " + professor.getEmail() + "/n" +
                            "Formação: " + professor.getFormacao() + "/n" +
                            "Especialização: " + professor.getEspecializacao() + "/n" +
                            "Data de Contratação: " + professor.getDataContratacao() + "/n"
            );
        }
        return "Disciplina \n" +
                "Id: " + this.id + "\n" +
                "Nome: " + this.nome + "\n" +
                "Carga horária: " + this.cargaHoraria + "\n" +
                "Ementa: " + this.ementa + "\n" +
                "Codigo: " + this.codigo + "\n" +
                "Nível: " + this.nivel + "\n" +
                "\t Professor /n" + professores + "\n" +
                "\t Turma /n" + turmas + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Disciplina that)) return false;
        return cargaHoraria == that.cargaHoraria && Objects.equals(id, that.id) && Objects.equals(nome, that.nome) && Objects.equals(ementa, that.ementa) && Objects.equals(codigo, that.codigo) && Objects.equals(nivel, that.nivel) && Objects.equals(professor, that.professor) && Objects.equals(turma, that.turma);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cargaHoraria, ementa, codigo, nivel, professor, turma);
    }

}
