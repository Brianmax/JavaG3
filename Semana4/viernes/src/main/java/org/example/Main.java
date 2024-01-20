package org.example;

import com.mongodb.client.MongoCollection;
import org.example.db.MongoDBConnector;
import org.example.documents.Comentario;
import org.example.documents.Producto;
import org.example.repository.ComentarioRepository;
import org.example.repository.ProductoRepository;
import org.example.service.ComentarioService;
import org.example.service.ProductoService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MongoDBConnector.connect();
        List<String> collections = MongoDBConnector.database.listCollectionNames().into(new ArrayList<>());
        MongoCollection comentarioCollection = MongoDBConnector.database.getCollection("comentarios");
        MongoCollection productoCollection = MongoDBConnector.database.getCollection("productos");

        ComentarioRepository comentarioRepository = new ComentarioRepository(comentarioCollection);
        ProductoRepository productoRepository = new ProductoRepository(productoCollection);


        ComentarioService comentarioService = new ComentarioService(comentarioRepository);
        ProductoService productoService = new ProductoService(productoRepository);

        //Comentario comentario = new Comentario();
        //comentario.setContenido("Este producto es agradable a los ninios");
        //comentarioService.agregarComentario(comentario);
        Producto producto = new Producto();
        producto.setNombreProducto("Laptop");
        producto.setPrecio(1999.9);
        producto.setComentarios(new ArrayList<>());
        productoService.agregarProducto(producto);
    }
}