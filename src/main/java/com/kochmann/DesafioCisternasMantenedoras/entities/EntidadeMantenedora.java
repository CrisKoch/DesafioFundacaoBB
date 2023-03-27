package com.kochmann.DesafioCisternasMantenedoras.entities;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity	
public class EntidadeMantenedora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeFantasia;

    @Column(nullable = false, unique = true)
    private String cnpj;

    @Embedded
    private Endereco endereco;

    @ElementCollection
    @CollectionTable(name = "cisternas_responsaveis")
    private List<Cisterna> cisternasResponsaveis;

    // getters e setters
}
