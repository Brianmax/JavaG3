package org.example;

import com.mongodb.client.MongoCollection;
import org.example.db.MongoDBConnector;
import org.example.documents.Comentario;
import org.example.documents.Producto;
import org.example.documents.Usuario;
import org.example.repository.ComentarioRepository;
import org.example.repository.ProductoRepository;
import org.example.repository.UsuarioRepository;
import org.example.service.ComentarioService;
import org.example.service.ProductoService;
import org.example.service.UsuarioService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MongoDBConnector.connect();
        List<String> collections = MongoDBConnector.database.listCollectionNames().into(new ArrayList<>());
        MongoCollection comentarioCollection = MongoDBConnector.database.getCollection("comentarios");
        MongoCollection productoCollection = MongoDBConnector.database.getCollection("productos");
        MongoCollection usuarioCollectin = MongoDBConnector.database.getCollection("usuarios");
        ComentarioRepository comentarioRepository = new ComentarioRepository(comentarioCollection);
        ProductoRepository productoRepository = new ProductoRepository(productoCollection);
        ComentarioService comentarioService = new ComentarioService(comentarioRepository);
        ProductoService productoService = new ProductoService(productoRepository);
        UsuarioRepository usuarioRepository = new UsuarioRepository(usuarioCollectin);
        UsuarioService usuarioService = new UsuarioService(usuarioRepository);
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setPassword("1234");
        usuario.setProductos(new ArrayList<>());
        usuario.setDireccions(new ArrayList<>());

        usuarioService.agregarUsuario(usuario);

    }
}