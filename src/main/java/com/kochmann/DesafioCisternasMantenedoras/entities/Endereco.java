package com.kochmann.DesafioCisternasMantenedoras.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String complemento;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String estado;

    // getters e setters
}

