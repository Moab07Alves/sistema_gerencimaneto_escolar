package com.projeto.sistema.escolar.models.entities;

import com.projeto.sistema.escolar.models.enums.Estado;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "enderecos")
@Entity
public class Endereco {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

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

    @OneToOne(mappedBy = "endereco")
    private Aluno aluno;

}
