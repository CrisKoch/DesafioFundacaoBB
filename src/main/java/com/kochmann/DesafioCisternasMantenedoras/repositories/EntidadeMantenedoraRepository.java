package com.kochmann.DesafioCisternasMantenedoras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kochmann.DesafioCisternasMantenedoras.entities.EntidadeMantenedora;

public interface EntidadeMantenedoraRepository extends JpaRepository<EntidadeMantenedora, Long> {
}
