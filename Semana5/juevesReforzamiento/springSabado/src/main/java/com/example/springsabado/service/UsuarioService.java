package com.example.springsabado.service;

import com.example.springsabado.model.Usuario;
import com.example.springsabado.repository.UsuarioRepository;
import com.example.springsabado.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public ResponseBase crearUsuario(Usuario usuario)
    {
        Usuario usuarioGuardado = usuarioRepository.save(usuario);
        return new ResponseBase(201, "creado", true, Optional.of(usuarioGuardado));
    }
}
