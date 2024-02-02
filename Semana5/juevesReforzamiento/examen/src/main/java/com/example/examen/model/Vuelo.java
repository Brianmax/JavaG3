package com.example.examen.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "vuelo")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vuelo_id")
    private Integer id;
    private Date fechaSalida;
    private Date fechaLlegada;
    @ManyToOne
    @JoinColumn(name = "avion_id_fk")
    private Avion avion;
}
