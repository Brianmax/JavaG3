package com.example.examen.repository;

import com.example.examen.model.Pasajero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasajeroRepository extends JpaRepository<Pasajero, Integer> {
}