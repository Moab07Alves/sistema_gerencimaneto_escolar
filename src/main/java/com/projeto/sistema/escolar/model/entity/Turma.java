package com.projeto.sistema.escolar.model.entity;

import com.projeto.sistema.escolar.model.enums.Turno;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
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

    public Turma(String nome, int ano, Turno turno, String sala) {
        this.nome = nome;
        this.ano = ano;
        this.turno = turno;
        this.sala = sala;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
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

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        this.professores.remove(professor);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

   public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
   }

   public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
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
        StringBuilder professores = new StringBuilder();
        for(Professor professor : this.professores) {
            professores.append(
                    "Nome: " + professor.getNome() + "/n" +
                    "CPF: " + professor.getCpf() + "/n" +
                    "E-mail: " + professor.getEmail() + "/n" +
                    "Formação: " + professor.getFormacao() + "/n" +
                    "Especialização: " + professor.getEspecializacao() + "/n" +
                    "Data de Contratação: " + professor.getDataContratacao() + "/n"
            );
        }
        StringBuilder alunos = new StringBuilder();
        for(Aluno aluno : this.alunos) {
            alunos.append(
                    "Nome: "+ aluno.getNome() + "/n" +
                    "Data de Nascimento: "+ aluno.getDataNascimento() + "/n" +
                    "CPF: "+ aluno.getCpf() + "/n" + aluno.getEmail() + "/n" +
                    "Telefone: "+ aluno.getTelefone() + "/n" + aluno.getSexo() + "/n" +
                    "Nome do responsável: "+ aluno.getNomeResponsavel() + "/n" +
                    "Data da matrícula: "+ aluno.getDataMatricula() + "/n"
            );
        }
        return "Turma /n" +
                "Id: " + this.id + "/n" +
                "Nome: " + this.nome + "/n" +
                "Ano: " + this.ano + "/n" +
                "Turno: " + this.turno + "/n" +
                "Sala: " + this.sala + "/n" +
                "\t Disciplinas /n" + disciplinas + "/n" +
                "\t Professores /n" + professores + "/n" +
                "\t Alunos /n " + alunos + "/n";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Turma turma)) return false;
        return ano == turma.ano && Objects.equals(id, turma.id) && Objects.equals(nome, turma.nome) && turno == turma.turno && Objects.equals(sala, turma.sala) && Objects.equals(disciplinas, turma.disciplinas) && Objects.equals(professores, turma.professores) && Objects.equals(alunos, turma.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ano, turno, sala, disciplinas, professores, alunos);
    }

}
