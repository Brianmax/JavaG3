package com.example.examen.controller;

import com.example.examen.model.Avion;
import com.example.examen.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/avion")
public class AvionController {
    @Autowired
    private AvionService avionService;

    @PostMapping("/save")
    public Avion saveAvion(@RequestBody Avion avion) {
        return avionService.saveAvion(avion);
    }

    @GetMapping("/get/{id}")
    public Avion getAvionById(@PathVariable Integer id) {
        return avionService.getAvionById(id).get();
    }
}
