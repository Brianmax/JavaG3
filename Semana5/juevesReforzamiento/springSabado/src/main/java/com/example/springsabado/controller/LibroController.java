package com.example.springsabado.controller;

import com.example.springsabado.model.Libro;
import com.example.springsabado.response.ResponseBase;
import com.example.springsabado.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/libro")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @PostMapping("/save")
    public ResponseBase crear(@RequestBody Libro libro)
    {
        return libroService.crearLibro(libro);
    }
}
