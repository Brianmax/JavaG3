package com.example.springBasico.controller;

import com.example.springBasico.entity.Producto;
import com.example.springBasico.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {
    private ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }
    @PostMapping("/crear")
    public ResponseEntity<?> crearProducto(@RequestBody Producto producto){
        return ResponseEntity.ok(producto);
    }
}
