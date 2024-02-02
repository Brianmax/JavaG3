package com.example.examen.service;

import com.example.examen.model.Avion;
import com.example.examen.repository.AvionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AvionService {
    @Autowired
    private AvionInterface avionRepository;

    public Avion saveAvion(Avion avion) {
        return avionRepository.save(avion);
    }
    public Optional<Avion> getAvionById(Integer id) {
        return avionRepository.findById(id);
    }
}
