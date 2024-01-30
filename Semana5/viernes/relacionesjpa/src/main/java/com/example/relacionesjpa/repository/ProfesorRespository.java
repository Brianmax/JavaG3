package com.example.relacionesjpa.repository;

import com.example.relacionesjpa.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRespository extends JpaRepository<Profesor, Integer> {
}
