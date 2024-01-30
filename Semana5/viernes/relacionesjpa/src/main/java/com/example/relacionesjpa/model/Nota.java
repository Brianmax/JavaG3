package com.example.relacionesjpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "notas")
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nota_id")
    Long id;
    Integer nota;
    @Column(name = "tipo_evaluacion")
    String tipo_evaluacion;
    @ManyToOne
    @JoinColumn(name = "curso_id_fk")
    Curso curso;
    @ManyToOne
    @JoinColumn(name = "profesor_id_fk")
    Profesor profesor;
    @ManyToOne
    @JoinColumn(name = "estudiante_id_fk")
    Estudiante estudiante;
}
