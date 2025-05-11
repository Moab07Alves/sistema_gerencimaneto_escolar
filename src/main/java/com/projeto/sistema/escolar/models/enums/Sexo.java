package com.projeto.sistema.escolar.models.enums;

public enum Sexo {

    Masculino("Masculino", "M"),
    Feminnin0("Feminino", "F");

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
