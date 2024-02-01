package com.example.relacionesjpa.controller;

import com.example.relacionesjpa.model.Apoderado;
import com.example.relacionesjpa.response.ResponseBase;
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
    public ResponseBase saveApoderado(@RequestBody Apoderado apoderado){
        return apoderadoService.saveApoderado(apoderado);
    }
    @GetMapping("/get/{id}")
    public ResponseBase findById(@PathVariable Integer id)
    {
        ResponseBase responseBase = apoderadoService.findById(id);
        return responseBase;
    }
}
