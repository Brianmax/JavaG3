package com.example.refuerzoJueves.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "libros")
public class Libro {
    @Id
    private String isbn;
    private String titulo;
    @Column(name = "anio_publicacion")
    private Integer anioPublicacion;
    private float precio;
    @ManyToOne
    @JoinColumn(name = "editorial_id_fk")
    private Editorial editorial;

    @ManyToMany(mappedBy = "libros")
    private List<Autor> autors;

    // relacion libros con comentarios

    @OneToMany(mappedBy = "libro")
    private List<Comentario> comentarios;
}
