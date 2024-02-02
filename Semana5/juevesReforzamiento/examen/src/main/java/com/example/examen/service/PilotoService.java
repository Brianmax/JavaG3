package com.example.examen.service;

import com.example.examen.model.Piloto;
import com.example.examen.repository.PilotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class PilotoService {
    @Autowired
    private PilotoRepository pilotoRepository;

    public Piloto savePiloto(Piloto piloto) {
        return pilotoRepository.save(piloto);
    }

    public Optional<Piloto> getPilotoById(Integer id) {
        return pilotoRepository.findById(id);
    }
}
