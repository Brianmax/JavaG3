package org.example.repository;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.example.documents.Producto;

public class ProductoRepository {
    public MongoCollection productoCollection;
    public ProductoRepository(MongoCollection productoCollection)
    {
        this.productoCollection = productoCollection;
    }

    public void save(Producto producto)
    {
        productoCollection.insertOne(producto.toDocument());
    }

    public Producto findProductoByNombre(String nombreProducto)
    {
        Document filter = new Document("nombre_producto", nombreProducto);
        Document productoBD = (Document) productoCollection.find(filter).first();
        if(productoBD!=null)
        {
            return Producto.fromDocument(productoBD);
        }
        return new Producto();
    }

}
