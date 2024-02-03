package com.example.springsabado.service;

import com.example.springsabado.model.Autor;
import com.example.springsabado.model.Libro;
import com.example.springsabado.repository.AutorRepository;
import com.example.springsabado.repository.LibroRepository;
import com.example.springsabado.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private AutorRepository autorRepository;

    public ResponseBase crearLibro(Libro libro)
    {
        Libro libroGuardado = libroRepository.save(libro);
        return new ResponseBase(201,"Libro creado", true, Optional.of(libroGuardado));
    }
    public ResponseBase agregarAutor(Map<String, Integer> request)
    {
        // buscar el libro
        Optional<Libro> libroBd = libroRepository.findById(request.get("idLibro"));
        Optional<Autor> autorBd = autorRepository.findById(request.get("idAutor"));

        if(libroBd.isPresent() && autorBd.isPresent())
        {
            Libro libroEntity = libroBd.get();
            Autor autorEntity = autorBd.get();
            libroEntity.getAutors().add(autorEntity);
            libroRepository.save(libroEntity);
            return new ResponseBase(201, "Registro exitoso", true, Optional.of(libroEntity));
        }
        return new ResponseBase(400, "Autor o libro no existen", true, Optional.empty());
    }
    public ResponseBase buscarPorId(Integer id)
    {
        return new ResponseBase(201, "encontrado", true,libroRepository.findById(id));
    }
}
