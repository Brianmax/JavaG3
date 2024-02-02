package com.example.examen.controller;

import com.example.examen.model.Reserva;
import com.example.examen.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/reserva")
public class ReservaController {
    @Autowired
    private ReservaService reservaService;
    @PostMapping("/save")
    public Reserva saveReserva(@RequestBody Reserva reserva) {
        return reservaService.saveReserva(reserva);
    }
    @GetMapping("/get/{id}")
    public Reserva getReservaById(@PathVariable Integer id) {
        return reservaService.getReservaById(id).get();
    }
}
