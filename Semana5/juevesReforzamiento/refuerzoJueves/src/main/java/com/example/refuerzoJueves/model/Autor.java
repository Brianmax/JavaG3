package com.example.refuerzoJueves.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private Integer id;
    private String nombre;
    private String nacionalidad;
    private String dni;
    private String correo;

    @ManyToMany
    @JoinTable(
            name = "libros_autores",
            joinColumns = @JoinColumn(name = "autor_id_fk"),
            inverseJoinColumns = @JoinColumn(name = "isbn")
    )
    List<Libro> libros;
}
