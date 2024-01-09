package org.example.clases;

import org.example.interfaces.Estudiante;
import org.example.interfaces.Profesor;

import java.util.ArrayList;
import java.util.List;

public class EstudianteProfesor extends Persona implements Profesor, Estudiante {
    List<Curso> cursosInscritos = new ArrayList<>();
    List<Curso> cursosImpartidos = new ArrayList<>();
    @Override
    public void matricularCurso() {

    }

    @Override
    public void entregarTarea() {

    }

    @Override
    public void calificarExamen() {

    }

    @Override
    public void asignarTarea() {

    }
}
