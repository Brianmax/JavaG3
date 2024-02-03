package com.example.refuerzoJueves.repository;

import com.example.refuerzoJueves.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}