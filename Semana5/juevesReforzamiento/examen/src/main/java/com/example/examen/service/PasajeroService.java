package com.example.examen.service;

import com.example.examen.model.Pasajero;
import com.example.examen.repository.PasajeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasajeroService {
    @Autowired
    private PasajeroRepository pasajeroRepository;

    public Pasajero savePasajero(Pasajero pasajero) {
        return pasajeroRepository.save(pasajero);
    }
    public PasajeroRepository getPasajeroRepository() {
        return pasajeroRepository;
    }
}
