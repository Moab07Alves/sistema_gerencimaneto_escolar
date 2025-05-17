package com.projeto.sistema.escolar.model.entity;

import com.projeto.sistema.escolar.model.enums.Estado;
import jakarta.persistence.*;

@Embeddable
public class Endereco {

    @Column(name = "logradouro", nullable = false)
    private String logradouro;

    @Column(name = "numero")
    private int numero;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "cidade", nullable = false)
    private String cidade;

    @Column(name = "estado", nullable = false)
    private Estado estado;

    @Column(name = "cep", nullable = false)
    private String cep;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, Estado estado, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco /n" +
                "Logradouro: " + logradouro +  "/n" +
                "Número: " + numero +  "/n" +
                "Complemento: " + complemento +  "/n" +
                "Bairro: " + bairro +  "/n" +
                "Cidade: " + cidade +  "/n" +
                "Estado: " + estado +  "/n" +
                "CEP: " + cep +  "/n";
    }

}
