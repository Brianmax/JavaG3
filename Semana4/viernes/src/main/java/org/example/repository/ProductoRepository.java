package org.example.repository;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;
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

    public Producto findProducto(String nombreProducto)
    {
        Document filter = new Document("nombre_producto", nombreProducto);
        Document productoBD = (Document) productoCollection.find(filter).first();
    }

}
