package org.example.repository;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.example.documents.Usuario;

import java.util.Optional;

public class UsuarioRepository {
    MongoCollection usuarioCollection;
    public UsuarioRepository(MongoCollection usuarioCollection){
        this.usuarioCollection = usuarioCollection;
    }
    // guardar
    // actualizar
    // leer
    // eliminar
    // create, read, update, delete
    public void save(Usuario usuario)
    {
        usuarioCollection.insertOne(usuario.toDocument());
    }
    public Usuario findByNombre(String nombre)
    {
        Document filter = new Document("nombre", nombre);
        Document usuarioBd = (Document) usuarioCollection.find(filter).first();
        if(usuarioBd!=null)
        {
            return Usuario.fromDocument(usuarioBd);
        }
        return new Usuario();
    }
}