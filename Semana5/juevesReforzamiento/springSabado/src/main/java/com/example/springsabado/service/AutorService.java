package com.example.springsabado.service;

import com.example.springsabado.model.Autor;
import com.example.springsabado.repository.AutorRepository;
import com.example.springsabado.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public ResponseBase agregarAutor(Autor autor)
    {
        // busqueda en la base de datos
        if(autorRepository.existsByNombre(autor.getNombre()))
        {
            return new ResponseBase(400, "Autor ya existe", false, Optional.empty());
        }
        Autor autorGuardado = autorRepository.save(autor);
        return new ResponseBase(201, "Autor creado con exito", true, Optional.of(autorGuardado));
    }
}
