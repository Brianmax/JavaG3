package com.example.relacionesjpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "apoderados")
public class Apoderado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "apoderado_id")
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
    @OneToMany(mappedBy = "apoderado")
    @JsonIgnoreProperties("apoderado")
    List<Estudiante> estudiantes;
}