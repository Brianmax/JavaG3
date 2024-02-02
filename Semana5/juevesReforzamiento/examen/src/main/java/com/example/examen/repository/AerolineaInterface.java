package com.example.examen.repository;

import com.example.examen.model.Aerolinea;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AerolineaInterface extends JpaRepository<Aerolinea, Integer> {
}
