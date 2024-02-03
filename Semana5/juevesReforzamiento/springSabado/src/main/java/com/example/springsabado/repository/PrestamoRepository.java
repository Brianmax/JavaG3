package com.example.springsabado.repository;

import com.example.springsabado.model.Prestamo;
import com.example.springsabado.model.PrestamoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, PrestamoId> {
}
