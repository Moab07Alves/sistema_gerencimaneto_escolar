package com.projeto.sistema.escolar.model.enums;

public enum Turno {

    MANHA("Manhã", "M"),
    TARDE("Tarde", "T"),
    NOITE("Noite", "N");

    String valor;
    String sigla;

    Turno(String valor, String sigla) {
        this.valor = valor;
        this.sigla = sigla;
    }

    public String getValor() {
        return valor;
    }

    public String getSigla() {
        return sigla;
    }

}
