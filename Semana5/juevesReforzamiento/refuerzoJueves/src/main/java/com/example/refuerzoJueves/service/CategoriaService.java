package com.example.refuerzoJueves.service;

import com.example.refuerzoJueves.model.Categoria;
import com.example.refuerzoJueves.repository.CategoriaRepository;
import com.example.refuerzoJueves.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public ResponseBase crearCategoria(Categoria categoria)
    {
        // verificar que la ccategoria no existe
        Categoria categoriaCreada = categoriaRepository.save(categoria);
        return new ResponseBase(201,
                "Categoria creada con exito",
                true, Optional.of(categoriaCreada));
    }
}
