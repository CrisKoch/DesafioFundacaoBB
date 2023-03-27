package com.kochmann.DesafioCisternasMantenedoras.entities;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.type.EnumType;
import org.springframework.data.annotation.Id;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Table(name="cisterna")
public class Cisterna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private LocalDate dataInauguracao;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoConstrucao tipoConstrucao;

    @ElementCollection
    @CollectionTable(name = "materiais_utilizados")
    private List<String> materiaisUtilizados;

    @ManyToOne
    @JoinColumn(name="entidade_id")
    private EntidadeMantenedora entidadeMantenedora;

    @Embedded
    private Localizacao localizacao;

    // getters e setters
}








