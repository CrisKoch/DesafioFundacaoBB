package com.kochmann.DesafioCisternasMantenedoras.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kochmann.DesafioCisternasMantenedoras.entities.Cisterna;
import com.kochmann.DesafioCisternasMantenedoras.repositories.CisternaRepository;

@RestController
@RequestMapping("/api/cisternas")
public class CisternaController {
	private final CisternaRepository repository;

	public CisternaController(CisternaRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public List<Cisterna> listarCisternas() {
		return repository.findAll();
	}

	@PostMapping
	public Cisterna adicionarCisterna(@RequestBody Cisterna cisterna) {
		return repository.save(cisterna);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cisterna> buscarCisternaPorId(@PathVariable Long id) {
		Optional<Cisterna> cisterna = repository.findById(id);
		return cisterna.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
}
