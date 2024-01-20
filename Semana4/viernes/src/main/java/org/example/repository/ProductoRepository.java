package org.example.repository;

import com.mongodb.client.MongoCollection;
import org.example.documents.Producto;

public class ProductoRepository {
    public MongoCollection productoCollection;
    public ProductoRepository(MongoCollection productoCollection)
    {
        this.productoCollection = productoCollection;
    }

    public void agregarProducto(Producto producto)
    {
        productoCollection.insertOne(producto.toDocument());
    }
}
