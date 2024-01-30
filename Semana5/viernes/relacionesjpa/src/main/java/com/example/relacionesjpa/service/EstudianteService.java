package com.example.relacionesjpa.service;

import com.example.relacionesjpa.model.Estudiante;
import com.example.relacionesjpa.repository.EstudianteRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;
    public Estudiante saveEstudiante(Estudiante estudiante)
    {
        estudiante.setFechaCreacion(new Date());
        return estudianteRepository.save(estudiante);
    }
    public Optional<Estudiante> findById(Integer id)
    {
        return estudianteRepository.findById(id);
    }
}
