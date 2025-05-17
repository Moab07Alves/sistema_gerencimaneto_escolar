package com.projeto.sistema.escolar.model.enums;

public enum Status {

    ATIVO("Ativo"),
    INATIVO("Inativo");

    String valor;

    Status(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
