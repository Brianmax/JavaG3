package com.example.refuerzoJueves.controller;

import com.example.refuerzoJueves.model.Libro;
import com.example.refuerzoJueves.repository.LibroRespository;
import com.example.refuerzoJueves.response.ResponseBase;
import com.example.refuerzoJueves.service.LibroService;
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
    public ResponseBase create(@RequestBody Libro libro)
    {
        ResponseBase responseService = libroService.agregarLibro(libro);
        return responseService;
    }
}
