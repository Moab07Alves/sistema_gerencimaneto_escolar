package com.projeto.sistema.escolar.model.enums;

public enum Sexo {

    MASCULINO("Masculino", "M"),
    FEMININO("Feminino", "F");

    String valor;
    String sigla;

    Sexo(String valor, String sigla) {
        this.valor = valor;
        this.sigla = sigla;
    }

    public String getValor() {
        return valor;
    }

}
