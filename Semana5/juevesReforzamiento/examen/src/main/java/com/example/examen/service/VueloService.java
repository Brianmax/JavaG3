package com.example.examen.service;

import com.example.examen.model.Vuelo;
import com.example.examen.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VueloService {
    @Autowired
    private VueloRepository vueloRepository;

    public Vuelo saveVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }

    public Optional<Vuelo> getVueloById(Integer id) {
        return vueloRepository.findById(id);
    }
}
