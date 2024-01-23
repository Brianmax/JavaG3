package org.example.repository;

import com.mongodb.client.MongoCollection;
import org.bson.types.ObjectId;
import org.example.documents.Usuario;

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
    public void agregarUsuario(Usuario usuario)
    {
        usuarioCollection.insertOne(usuario.toDocument());
    }
    public void agregarProductoUsuario(ObjectId id_usuario, ObjectId id_producto)
    {

    }
}