package com.example.examen.controller;

import com.example.examen.model.Vuelo;
import com.example.examen.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vuelo")
public class VueloController {
    @Autowired
    private VueloService vueloService;
    @PostMapping("/save")
    public Vuelo saveVuelo(@RequestBody Vuelo vuelo) {
        return vueloService.saveVuelo(vuelo);
    }
    @GetMapping("/get/{id}")
    public Vuelo getVueloById(@PathVariable Integer id) {
        return vueloService.getVueloById(id).get();
    }
}