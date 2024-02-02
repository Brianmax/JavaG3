package com.example.examen.controller;

import com.example.examen.model.Aerolinea;
import com.example.examen.service.AerolineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/aerolinea")
public class AerolineaController {
    @Autowired
    private AerolineaService aerolineaService;

    @PostMapping("/save")
    public Aerolinea saveAerolinea(@RequestBody Aerolinea aerolinea) {
        return aerolineaService.saveAerolinea(aerolinea);
    }
    @GetMapping("/get/{id}")
    public Aerolinea getAerolineaById(@PathVariable Integer id) {
        return aerolineaService.getAerolineaById(id).get();
    }
}
