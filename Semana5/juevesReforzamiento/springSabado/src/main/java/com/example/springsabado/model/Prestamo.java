package com.example.springsabado.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Table(name = "prestamo")
@Entity
public class Prestamo {
    @EmbeddedId
    PrestamoId prestamoId;
    @Column(name = "fecha_prestamo")
    private Date fechaPrestamo;
    @Column(name = "fecha_devolucion")
    private Date fechaDevolucion;
}
