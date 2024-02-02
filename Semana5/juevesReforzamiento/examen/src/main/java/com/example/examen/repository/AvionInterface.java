package com.example.examen.repository;

import com.example.examen.model.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionInterface extends JpaRepository<Avion, Integer> {
}
