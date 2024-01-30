package com.example.relacionesjpa.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

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
}
