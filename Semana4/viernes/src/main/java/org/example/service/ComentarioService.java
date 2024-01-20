package org.example.service;

import org.example.documents.Comentario;
import org.example.repository.ComentarioRepository;

public class ComentarioService {
    ComentarioRepository comentarioRepository;
    public ComentarioService(ComentarioRepository comentarioRepository)
    {
        this.comentarioRepository = comentarioRepository;
    }

    public void agregarComentario(Comentario comentario)
    {
        // logica de negocio
        comentarioRepository.agregarComentario(comentario);
    }
}
