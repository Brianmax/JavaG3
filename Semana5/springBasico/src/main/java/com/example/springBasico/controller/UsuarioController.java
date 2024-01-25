package com.example.springBasico.controller;

import com.example.springBasico.entity.Usuario;
import com.example.springBasico.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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
    @GetMapping("usuario/{id}")
    public ResponseEntity<?> buscarUsuarioId(@PathVariable Integer id)
    {
        Optional<Usuario> optional = usuarioService.buscarId(id);
        if(optional.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }
        return ResponseEntity.ok(optional.get());
    }
    @PutMapping("usuario/{id}")
    public ResponseEntity<?> actualizarPorId(@PathVariable Integer id, @RequestBody Usuario usuario)
    {
        Optional<Usuario> updateUser = usuarioService.updateById(id, usuario);
        if(updateUser.isPresent())
        {
            return ResponseEntity.ok(updateUser.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no existe");
    }
    @GetMapping("usuario/todo")
    public ResponseEntity<?> findAll()
    {
        List<Usuario> usuarioList = usuarioService.findAll();
        if(usuarioList.isEmpty())
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No existen registros");
        }
        return ResponseEntity.ok(usuarioList);
    }
    @GetMapping("usuario/query")
    public ResponseEntity<?> queryParam(@RequestParam Map<String, String> request)
    {
        Optional<Usuario> usuario = usuarioService.buscarUsuarios(request);
        if(usuario.isPresent())
        {
            return ResponseEntity.ok(usuario.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
    }
}
