package com.example.refuerzoJueves.repository;

import com.example.refuerzoJueves.model.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
}
