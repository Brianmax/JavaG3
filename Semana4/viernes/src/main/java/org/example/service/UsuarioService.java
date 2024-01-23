package org.example.service;

import org.bson.Document;
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
        // verificamos que el usuario no exista
        Usuario usuarioBd = usuarioRepository.findByNombre(usuario.getNombre());
        if(usuarioBd.getNombre()!=null)
        {
            System.out.println("El usuario ya existe");
            return;
        }
        usuarioRepository.save(usuario);
    }

    public void validarProductoUsuario(ObjectId id_usuario, ObjectId id_producto)
    {

    }
}
