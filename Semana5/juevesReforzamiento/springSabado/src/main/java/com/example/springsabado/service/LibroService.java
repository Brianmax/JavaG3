package com.example.springsabado.service;

import com.example.springsabado.model.Libro;
import com.example.springsabado.repository.LibroRepository;
import com.example.springsabado.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public ResponseBase crearLibro(Libro libro)
    {
        Libro libroGuardado = libroRepository.save(libro);
        return new ResponseBase(201,"Libro creado", true, Optional.of(libroGuardado));
    }
}
