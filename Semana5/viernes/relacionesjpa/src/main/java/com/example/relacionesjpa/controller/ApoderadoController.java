package com.example.relacionesjpa.controller;

import com.example.relacionesjpa.model.Apoderado;
import com.example.relacionesjpa.service.ApoderadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
