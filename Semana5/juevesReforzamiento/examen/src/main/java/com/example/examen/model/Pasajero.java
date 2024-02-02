package com.example.examen.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pasajero")
public class Pasajero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pasajero_id")
    private Integer id;
    private String nombre;
    private String apellido;
    private boolean estado;
}
