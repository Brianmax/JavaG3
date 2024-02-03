package com.example.springsabado.controller;

import com.example.springsabado.model.Prestamo;
import com.example.springsabado.model.PrestamoId;
import com.example.springsabado.response.ResponseBase;
import com.example.springsabado.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/prestamo")
public class PrestamoController {
    @Autowired
    private PrestamoService prestamoService;

    @PostMapping("/generate")
    public ResponseBase generarPrestamo(@RequestBody Prestamo prestamo)
    {
        return prestamoService.generarPrestamo(prestamo);
    }
}
