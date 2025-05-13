package com.projeto.sistema.escolar.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.sistema.escolar.models.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
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

    public Professor(String nome, String cpf, String email, String formacao, String especializacao, LocalDate dataContratacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.formacao = formacao;
        this.especializacao = especializacao;
        this.dataContratacao = dataContratacao;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

    public void removerTurma(Turma turma) {
        this.turmas.remove(turma);
    }

    @Override
    public String toString() {
        StringBuilder disciplinas = new StringBuilder();
        for(Disciplina disciplina : this.disciplinas) {
            disciplinas.append(
                    "Nome: " + disciplina.getNome() + "/n" +
                            "Código: " + disciplina.getCodigo() + "/n" +
                            "Nível: " + disciplina.getNivel() + "/n" +
                            "Carga horária: " + disciplina.getCargaHoraria() + "/n" +
                            "Ementa: " + disciplina.getEmenta() + "/n"
            );
        }
        StringBuilder turmas = new StringBuilder();
        for(Turma turma : this.turmas){
            turmas.append(
                    "Nome: " + turma.getNome() + "/n" +
                    "Ano: " + turma.getAno() + "/n" +
                    "Turno: " + turma.getTurno() + "/n" +
                    "Sala: " + turma.getSala() + "/n"
            );
        }
        return "Professor /n" +
                "Id: " + this.id + "/n" +
                "Nome: " + this.nome + "/n" +
                "CPF: " + this.cpf + "/n" +
                "E-mail: " + this.email + "/n" +
                "Formacao: " + this.formacao + "/n" +
                "Especializacao: " + this.especializacao + "/n" +
                "Data de contratacao: " + this.dataContratacao + "/n" +
                "Status: " + this.status + "/n" +
                "\t Disciplinas /n" + disciplinas + "/n" +
                "\t Turmas /n" + turmas + "/n";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Professor professor)) return false;
        return Objects.equals(id, professor.id) && Objects.equals(nome, professor.nome) && Objects.equals(cpf, professor.cpf) && Objects.equals(email, professor.email) && Objects.equals(formacao, professor.formacao) && Objects.equals(especializacao, professor.especializacao) && Objects.equals(dataContratacao, professor.dataContratacao) && status == professor.status && Objects.equals(disciplinas, professor.disciplinas) && Objects.equals(turmas, professor.turmas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, email, formacao, especializacao, dataContratacao, status, disciplinas, turmas);
    }

}
