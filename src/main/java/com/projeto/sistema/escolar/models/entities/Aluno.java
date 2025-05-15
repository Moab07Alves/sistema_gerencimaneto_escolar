package com.projeto.sistema.escolar.models.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.projeto.sistema.escolar.models.enums.Sexo;
import com.projeto.sistema.escolar.models.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "alunos")
@Entity
public class Aluno {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", nullable = false, unique = true, length = 11)
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "sexo", nullable = false)
    private Sexo sexo;

    @Column(name = "nome_responsavel", nullable = false)
    private String nomeResponsavel;

    @Embedded
    private Endereco endereco;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone", length = 11)
    private String telefone;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "data_matricula", nullable = false)
    private LocalDate dataMatricula;

    @ManyToOne
    @JoinColumn(name = "turma_fk")
    private Turma turma;

    public Aluno(String nome, LocalDate dataNascimento, Sexo sexo, String cpf, String email, String telefone, String nomeResponsavel, Status status, LocalDate dataMatricula, Endereco endereco, Turma turma) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.nomeResponsavel = nomeResponsavel;
        this.dataMatricula = dataMatricula;
        this.endereco = endereco;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        StringBuilder turma = new StringBuilder();
        turma.append(
                "Nome: " + this.turma.getNome() + "/n" + "Ano: " +
                this.turma.getAno() + "/n" + "Turno: " +
                this.turma.getTurno() + "/n" + "Sala: " +
                this.turma.getSala() + "/n"
        );
        StringBuilder endereco = new StringBuilder();
        endereco.append(
                "Logradouro: " + this.endereco.getLogradouro() +  "/n" +
                "Número: " + this.endereco.getNumero() +  "/n" +
                "Complemento: " + this.endereco.getComplemento() +  "/n" +
                "Bairro: " + this.endereco.getBairro() +  "/n" +
                "Cidade: " + this.endereco.getCidade() +  "/n" +
                "Estado: " + this.endereco.getEstado() +  "/n" +
                "CEP: " + this.endereco.getCep() +  "/n"
        );
        return "Aluno \n" +
                "Id: " + this.id + "\n" +
                "Nome: " + this.nome + "\n" +
                "Data de nascimento: " + this.dataNascimento + "\n" +
                "Sexo: " + this.sexo + "\n" +
                "CPF: " + this.cpf + "\n" +
                "E-mail: " + this.email + "\n" +
                "Telefone: " + this.telefone + "\n" +
                "Nome do responsável: " + this.nomeResponsavel + "\n" +
                "Status: " + this.status + "\n" +
                "Data da matricula: " + this.dataMatricula + "\n" +
                "\t Endereço /n" + endereco + "\n" +
                "\t Turma /n" + turma + "\n";
    }

}
