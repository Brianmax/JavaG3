package com.example.springBasico.service;

import com.example.springBasico.entity.Usuario;
import com.example.springBasico.repository.UsuarioRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Service;

import java.beans.PropertyDescriptor;
import java.util.*;

@Service
public class UsuarioService {
    UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario crearUsuario(Usuario usuario) {
        Usuario usuarioGuardado = usuarioRepository.save(usuario);
        return usuarioGuardado;
    }

    public Optional<Usuario> buscarId(Integer id) {
        Optional<Usuario> usuarioBd = usuarioRepository.findById(id);
        return usuarioBd;
    }

    public Optional<Usuario> updateById(Integer id, Usuario usuario) {
        Optional<Usuario> usuarioBd = usuarioRepository.findById(id);
        if (usuarioBd.isPresent()) {
            Usuario user = usuarioBd.get();
            user.setNombre(usuario.getNombre());
            user.setApellido(usuario.getApellido());
            Usuario usuarioActualizado = usuarioRepository.save(user);
            return Optional.of(usuarioActualizado);
        }
        return Optional.empty();
    }

    public List<Usuario> findAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    public Optional<Usuario> actualizarNombre(Integer id, Usuario usuario) {
        Optional<Usuario> usuarioBd = usuarioRepository.findById(id);
        if(usuarioBd.isPresent())
        {
            Usuario userOptional = usuarioBd.get();
            userOptional.setNombre(usuario.getNombre());
            return Optional.of(usuarioRepository.save(userOptional));
        }
        return Optional.empty();
    }
    public Optional<Usuario> buscarUsuarios(Map<String, String> request)
    {
        Optional<Usuario> usuario = usuarioRepository.findByNombreAndApellido(request.get("nombre"), request.get("apellido"));
        return usuario;
    }
}
