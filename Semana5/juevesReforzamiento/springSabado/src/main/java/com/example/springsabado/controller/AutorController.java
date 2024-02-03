package com.example.springsabado.controller;

import com.example.springsabado.model.Autor;
import com.example.springsabado.response.ResponseBase;
import com.example.springsabado.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/autor")
public class AutorController {
    @Autowired
    private AutorService autorService;

    @PostMapping("/save")
    public ResponseBase crear(@RequestBody Autor autor)
    {
        return autorService.agregarAutor(autor);
    }
}
