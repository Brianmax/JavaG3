package com.example.refuerzoJueves.service;

import com.example.refuerzoJueves.model.Autor;
import com.example.refuerzoJueves.repository.AutorRepository;
import com.example.refuerzoJueves.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutorService {
    @Autowired
    private AutorRepository autorRepository;

    public ResponseBase agregarAutor(Autor autor)
    {
        // verificar que el autor no exista
        Optional<Autor> autorBd = autorRepository.findByDni(autor.getDni());
        if(autorBd.isPresent())
        {
            return new ResponseBase(400,
                    "El autor ya existe",
                    false,
                    Optional.empty());
        }
        // verificamos que el dni tenga 8 digitos y que el correo tenga @
        String dniAutor = autor.getDni();
        String correoAutor = autor.getCorreo();
        if(dniAutor.length()!=8 || !correoAutor.contains("@"))
        {
            return new ResponseBase(400,
                    "Datos no validos",
                    false,
                    Optional.empty());
        }
        Autor autorGuardado = autorRepository.save(autor);
        return new ResponseBase(201,
                "Autor creado con exito",
                true,
                Optional.of(autorGuardado));
    }
    public ResponseBase buscarPorId(Integer id)
    {
        Optional<Autor> autorBd = autorRepository.findById(id);
        if(autorBd.isPresent())
        {
            return new ResponseBase(200, "Autor encontrado con exito", true, Optional.of(autorBd.get()));
        }
        return new ResponseBase(404, "Autor no existe", false, Optional.empty());
    }
}
