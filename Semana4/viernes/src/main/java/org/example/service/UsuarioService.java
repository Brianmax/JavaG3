package org.example.service;

import org.bson.types.ObjectId;
import org.example.documents.Usuario;
import org.example.repository.UsuarioRepository;

public class UsuarioService {
    UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository)
    {
        this.usuarioRepository = usuarioRepository;
    }

    public void agregarUsuario(Usuario usuario)
    {
        // logica de negocio
        // vefifcamos que el usuario no exista
        // verficamos que el nombre tenga al menos tres caractarees
        usuarioRepository.save(usuario);
    }

    public void validarProductoUsuario(ObjectId id_usuario, ObjectId id_producto)
    {

    }
}
