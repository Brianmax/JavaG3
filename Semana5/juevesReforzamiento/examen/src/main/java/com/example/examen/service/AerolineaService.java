package com.example.examen.service;

import com.example.examen.model.Aerolinea;
import com.example.examen.repository.AerolineaInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AerolineaService {
    @Autowired
    private AerolineaInterface aerolineaRepository;

    public Aerolinea saveAerolinea(Aerolinea aerolinea) {
        return aerolineaRepository.save(aerolinea);
    }
    public Optional<Aerolinea> getAerolineaById(Integer id) {
        return aerolineaRepository.findById(id);
    }
}
