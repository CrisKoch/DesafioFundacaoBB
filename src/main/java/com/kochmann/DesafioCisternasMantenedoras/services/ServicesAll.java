package com.kochmann.DesafioCisternasMantenedoras.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.kochmann.DesafioCisternasMantenedoras.entities.Cisterna;
import com.kochmann.DesafioCisternasMantenedoras.entities.EntidadeMantenedora;
import com.kochmann.DesafioCisternasMantenedoras.repositories.CisternaRepository;
import com.kochmann.DesafioCisternasMantenedoras.repositories.EntidadeMantenedoraRepository;

@Service
public class ServicesAll {
    @Autowired
    private CisternaRepository cisternaRepository;

    @Autowired
    private EntidadeMantenedoraRepository entidadeMantenedoraRepository;

    public Cisterna cadastrarCisterna(Cisterna cisterna) {
        return cisternaRepository.save(cisterna);
    }

    public List<Cisterna> listarCisternas() {
        return cisternaRepository.findAll();
    }

    public Cisterna buscarCisterna(Long id) {
        return cisternaRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cisterna não encontrada"));
    }

    public void excluirCisterna(Long id) {
        Cisterna cisterna = buscarCisterna(id);
        cisternaRepository.delete(cisterna);
    }

    public EntidadeMantenedora cadastrarEntidadeMantenedora(EntidadeMantenedora entidadeMantenedora) {
        return entidadeMantenedoraRepository.save(entidadeMantenedora);
    }

    public List<EntidadeMantenedora> listarEntidadesMantenedoras() {
        return entidadeMantenedoraRepository.findAll();
    }

    public EntidadeMantenedora buscarEntidadeMantenedora(Long id) {
        return entidadeMantenedoraRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Entidade mantenedora não encontrada"));
    }

    public void excluirEntidadeMantenedora(Long id) {
        EntidadeMantenedora entidadeMantenedora = buscarEntidadeMantenedora(id);
        entidadeMantenedoraRepository.delete(entidadeMantenedora);
    }
}
