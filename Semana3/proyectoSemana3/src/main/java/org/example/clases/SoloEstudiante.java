package org.example.clases;

import org.example.interfaces.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class SoloEstudiante extends Persona implements Estudiante {
    List<Curso> cursosEstudiante = new ArrayList<>();
    @Override
    public void matricularCurso() {
    }

    @Override
    public void entregarTarea() {

    }
}
