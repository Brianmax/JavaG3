package com.example.examen.controller;

import com.example.examen.model.Pasajero;
import com.example.examen.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/pasajero")
public class PasajeroController {
    @Autowired
    private PasajeroService pasajeroService;

    @PostMapping("/save")
    public Pasajero savePasajero(@RequestBody Pasajero pasajero) {
        return pasajeroService.savePasajero(pasajero);
    }

    @GetMapping("/get/{id}")
    public Pasajero getPasajeroById(@PathVariable Integer id) {
        return pasajeroService.getPasajeroRepository().findById(id).get();
    }
}
