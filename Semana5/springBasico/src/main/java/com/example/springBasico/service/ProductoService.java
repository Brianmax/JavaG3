package com.example.springBasico.service;

import com.example.springBasico.entity.Producto;
import com.example.springBasico.repository.ProductoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    ProductoRepository productoRepository;
    public ProductoService(ProductoRepository productoRepository)
    {
        this.productoRepository = productoRepository;
    }
    public Producto crearProducto(Producto producto)
    {
        return productoRepository.save(producto);
    }
}
