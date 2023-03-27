package com.kochmann.DesafioCisternasMantenedoras.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Localizacao {
    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String estado;

    // getters e setters
}