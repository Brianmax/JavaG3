package com.example.springsabado.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.swing.border.LineBorder;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Table(name = "autor")
@Entity
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer estado;
    @ManyToMany(mappedBy = "autors")
    @JsonIgnoreProperties("autors")
    Set<Libro> libros;
}
