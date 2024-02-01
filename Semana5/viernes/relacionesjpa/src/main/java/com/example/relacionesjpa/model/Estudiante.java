package com.example.relacionesjpa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Table(name = "estudiantes")
@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "estudiante_id")
    private Integer id;
    private String nombre;
    private String apellido;
    private String contrasenia;
    private String role;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;
    private String email;
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "apoderado_id_fk")
    private Apoderado apoderado;
    // relacion muchos a muchos con curso
    @ManyToMany
    @JoinTable(name = "estudiante_curso",
        joinColumns = @JoinColumn(name = "estudiante_id_fk"),
        inverseJoinColumns = @JoinColumn(name = "curso_id_fk"))
    List<Curso> cursos;
}
