package com.example.springBasico.controller;

import com.example.springBasico.entity.Usuario;
import com.example.springBasico.service.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService)
    {
        this.usuarioService =  usuarioService;
    }
    @PostMapping("/crear")
    public Usuario guardarUsuario(@RequestBody Usuario usuario)
    {
        return usuarioService.crearUsuario(usuario);
    }
}
