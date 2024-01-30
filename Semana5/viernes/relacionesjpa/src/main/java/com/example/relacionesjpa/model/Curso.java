package com.example.relacionesjpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "cursos")
@Getter
@Setter
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "curso_id")
    private Integer id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "profesor_id_fk")
    private Profesor profesor;
    @ManyToMany(mappedBy = "cursos")
    List<Estudiante> estudianteList;
}
