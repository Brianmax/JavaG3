package org.example.service;

import org.example.documents.Producto;
import org.example.repository.ProductoRepository;

public class ProductoService {
    private ProductoRepository productoRepository;
    public ProductoService(ProductoRepository productoRepository)
    {
        this.productoRepository=productoRepository;
    }
    public void agregarProducto(Producto producto)
    {
        // logica de nogocio
        productoRepository.agregarProducto(producto);
    }
}
