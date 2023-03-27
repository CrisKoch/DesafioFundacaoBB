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

import com.kochmann.DesafioCisternasMantenedoras.entities.EntidadeMantenedora;
import com.kochmann.DesafioCisternasMantenedoras.repositories.EntidadeMantenedoraRepository;

@RestController
@RequestMapping("/api/entidades")
public class EntidadeMantenedoraController {
	private final EntidadeMantenedoraRepository repository;

	public EntidadeMantenedoraController(EntidadeMantenedoraRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public List<EntidadeMantenedora> listarEntidades() {
		return repository.findAll();
	}

	@PostMapping
	public EntidadeMantenedora adicionarEntidade(@RequestBody EntidadeMantenedora entidade) {
		return repository.save(entidade);
	}

	@GetMapping("/{id}")
	public ResponseEntity<EntidadeMantenedora> buscarEntidadePorId(@PathVariable Long id) {
		Optional<EntidadeMantenedora> entidade = repository.findById(id);
		return entidade.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
}
