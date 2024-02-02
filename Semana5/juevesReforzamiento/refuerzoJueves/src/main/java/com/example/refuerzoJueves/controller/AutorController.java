package com.example.refuerzoJueves.controller;

import com.example.refuerzoJueves.model.Autor;
import com.example.refuerzoJueves.response.ResponseBase;
import com.example.refuerzoJueves.service.AutorService;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/autor")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @PostMapping("/create")
    public ResponseBase crearAutor(@RequestBody Autor autor)
    {
        return autorService.agregarAutor(autor);
    }
    @GetMapping("/{id}")
    public ResponseBase buscarPorId(@PathVariable Integer id)
    {
        return autorService.buscarPorId(id);
    }
}
