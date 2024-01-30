package com.example.relacionesjpa.repository;

import com.example.relacionesjpa.model.Apoderado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApoderadoRepository extends JpaRepository<Apoderado, Integer>{
}
