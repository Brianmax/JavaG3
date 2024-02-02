package com.example.examen.controller;

import com.example.examen.model.Piloto;
import com.example.examen.service.PilotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/piloto")
public class PilotoController {
    @Autowired
    private PilotoService pilotoService;

    @PostMapping("/save")
    public Piloto savePiloto(@RequestBody Piloto piloto) {
        return pilotoService.savePiloto(piloto);
    }
    @GetMapping("/get/{id}")
    public Piloto getPilotoById(@PathVariable Integer id) {
        return pilotoService.getPilotoById(id).get();
    }
}
