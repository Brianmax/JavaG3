package org.example.clases;

import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.Estudiante;

import java.util.List;
@Getter
@Setter
public class Curso {
    String codigo;
    String nombre;
    List<Estudiante> estudiantes;
}
