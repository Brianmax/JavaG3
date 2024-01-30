package com.example.relacionesjpa.controller;

import com.example.relacionesjpa.model.Apoderado;
import com.example.relacionesjpa.service.ApoderadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/apoderado")
public class ApoderadoController {
    @Autowired
    private ApoderadoService apoderadoService;

    @PostMapping("/save")
    public ResponseEntity<?> saveApoderado(@RequestBody Apoderado apoderado){
        Apoderado apoderadoGuardado = apoderadoService.saveApoderado(apoderado);
        return ResponseEntity.ok(apoderadoGuardado);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id)
    {
        Optional<Apoderado> apoderadoBd = apoderadoService.findById(id);
        if(apoderadoBd.isPresent())
        {
            return ResponseEntity.ok(apoderadoBd);
        }
        return ResponseEntity.notFound().build();
    }
}
