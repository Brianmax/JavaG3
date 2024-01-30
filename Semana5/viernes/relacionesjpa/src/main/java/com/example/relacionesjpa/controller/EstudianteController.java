package com.example.relacionesjpa.controller;

import com.example.relacionesjpa.model.Estudiante;
import com.example.relacionesjpa.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/estudiante")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/save")
    public ResponseEntity<?> saveEstudiante(@RequestBody Estudiante estudiante)
    {
        Estudiante estudianteGuardado = estudianteService.saveEstudiante(estudiante);
        return ResponseEntity.ok(estudianteGuardado);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id)
    {
        Optional<Estudiante> estudianteBd = estudianteService.findById(id);
        if(estudianteBd.isPresent()){
            return ResponseEntity.ok(estudianteBd.get());
        }
        return ResponseEntity.notFound().build();
    }
}
