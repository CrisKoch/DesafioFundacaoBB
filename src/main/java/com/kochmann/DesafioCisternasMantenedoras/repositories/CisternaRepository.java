package com.kochmann.DesafioCisternasMantenedoras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kochmann.DesafioCisternasMantenedoras.entities.Cisterna;

public interface CisternaRepository extends JpaRepository<Cisterna, Long> {
}
