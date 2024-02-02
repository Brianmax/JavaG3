package com.example.refuerzoJueves.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comentario_id")
    private Integer id;
    private String contenido;

    // relacion con libros

    @ManyToOne
    @JoinColumn(name = "libro_isbn_fk")
    private Libro libro;
}
