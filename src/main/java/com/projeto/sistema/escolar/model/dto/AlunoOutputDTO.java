package com.projeto.sistema.escolar.model.dto;

import com.projeto.sistema.escolar.model.entity.Endereco;
import com.projeto.sistema.escolar.model.entity.Turma;
import com.projeto.sistema.escolar.model.enums.Sexo;
import com.projeto.sistema.escolar.model.enums.Status;

import java.time.LocalDate;

public class AlunoOutputDTO {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private String nomeResponsavel;
    private String email;
    private String telefone;
    private LocalDate dataMatricula;
    private Status status;
    private Endereco endereco;
    private Turma turma;

    public AlunoOutputDTO(Long id, String nome, String cpf, LocalDate dataNascimento, Sexo sexo, String nomeResponsavel, String email, String telefone, LocalDate dataMatricula, Status status, Endereco endereco, Turma turma) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.nomeResponsavel = nomeResponsavel;
        this.email = email;
        this.telefone = telefone;
        this.dataMatricula = dataMatricula;
        this.status = status;
        this.endereco = endereco;
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
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

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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

}
