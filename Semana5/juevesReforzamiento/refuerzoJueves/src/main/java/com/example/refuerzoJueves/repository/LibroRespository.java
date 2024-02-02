package com.example.refuerzoJueves.repository;

import com.example.refuerzoJueves.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRespository extends JpaRepository<Libro, String> {
}
