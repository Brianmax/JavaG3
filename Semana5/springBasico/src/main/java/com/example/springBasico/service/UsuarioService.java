package com.example.springBasico.service;

import com.example.springBasico.entity.Usuario;
import com.example.springBasico.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository)
    {
        this.usuarioRepository = usuarioRepository;
    }
    public Usuario crearUsuario(Usuario usuario)
    {
        Usuario usuarioGuardado = usuarioRepository.save(usuario);
        return usuarioGuardado;
    }
}
