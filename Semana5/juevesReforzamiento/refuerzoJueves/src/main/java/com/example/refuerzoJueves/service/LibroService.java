package com.example.refuerzoJueves.service;

import com.example.refuerzoJueves.model.Libro;
import com.example.refuerzoJueves.repository.LibroRespository;
import com.example.refuerzoJueves.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    private LibroRespository libroRespository;

    public ResponseBase agregarLibro(Libro libro)
    {
        Libro libroGuardado = libroRespository.save(libro);
        return new ResponseBase(201, "Libro Creado con exito", true,
                Optional.of(libroGuardado));
    }
}
