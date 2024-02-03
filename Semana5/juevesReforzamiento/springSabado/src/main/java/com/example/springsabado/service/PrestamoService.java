package com.example.springsabado.service;

import com.example.springsabado.model.Prestamo;
import com.example.springsabado.model.PrestamoId;
import com.example.springsabado.repository.LibroRepository;
import com.example.springsabado.repository.PrestamoRepository;
import com.example.springsabado.repository.UsuarioRepository;
import com.example.springsabado.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrestamoService {
    @Autowired
    private PrestamoRepository prestamoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private LibroRepository libroRepository;

    public ResponseBase generarPrestamo(Prestamo prestamo)
    {
        Integer libroId = prestamo.getPrestamoId().getLibroId();
        Integer usuarioId = prestamo.getPrestamoId().getUsuarioId();
        if(libroRepository.existsById(libroId) && usuarioRepository.existsById(usuarioId))
        {
            Prestamo prestamoGenerado = prestamoRepository.save(prestamo);
            return new ResponseBase(201, "Created", true, Optional.of(prestamoGenerado));
        }
        return new ResponseBase(400,"Libro o usuario no existe", false, Optional.empty());
    }
}
