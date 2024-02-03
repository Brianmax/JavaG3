package com.example.springsabado.repository;

import com.example.springsabado.model.Autor;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Integer> {
    Optional<Autor> findByNombre(String nombre);
    boolean existsByNombre(String nombre);
}
