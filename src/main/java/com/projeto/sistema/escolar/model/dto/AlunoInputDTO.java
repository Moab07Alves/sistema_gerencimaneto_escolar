package com.projeto.sistema.escolar.model.dto;

import com.projeto.sistema.escolar.model.entity.Endereco;
import com.projeto.sistema.escolar.model.enums.Sexo;
import com.projeto.sistema.escolar.model.enums.Status;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public class AlunoInputDTO {

    @NotBlank
    private String nome;

    // Fazer uma classe para validação de CPF
    @NotBlank
    @Pattern(regexp = "^(\\d{3}\\.?){3}-?\\d{2}$")
    private String cpf;

    // Fazer uma classe para validação o campo de data
    @Past
    @NotNull
    private LocalDate dataNascimento;

    @NotNull
    private Sexo sexo;

    @NotBlank
    private String nomeResponsavel;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = "^(\\(?\\d{2}\\)?\\s?)?(9\\d{4}|[2-5]\\d{3})-?\\d{4}$")
    private String telefone;

    // Fazer uma classe para validação o campo de data
    @NotNull
    private LocalDate dataMatricula;

    @NotNull
    private Status status;

    @NotNull
    private Endereco endereco;

    public AlunoInputDTO(String nome, String cpf, LocalDate dataNascimento, Sexo sexo, String nomeResponsavel, Endereco endereco, String email, String telefone, Status status, LocalDate dataMatricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.nomeResponsavel = nomeResponsavel;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.status = status;
        this.dataMatricula = dataMatricula;
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

}
