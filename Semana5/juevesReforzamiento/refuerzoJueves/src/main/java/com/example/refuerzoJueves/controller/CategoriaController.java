package com.example.refuerzoJueves.controller;

import com.example.refuerzoJueves.model.Categoria;
import com.example.refuerzoJueves.response.ResponseBase;
import com.example.refuerzoJueves.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @PostMapping("save")
    public ResponseBase createCategoria(@RequestBody Categoria categoria)
    {
        return categoriaService.crearCategoria(categoria);
    }
}
