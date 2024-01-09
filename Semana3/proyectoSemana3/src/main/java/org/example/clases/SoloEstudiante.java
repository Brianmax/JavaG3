package org.example.clases;

import org.example.interfaces.Estudiante;

import java.util.ArrayList;
import java.util.List;

public class SoloEstudiante extends Persona implements Estudiante {
    List<Curso> cursosEstudiante = new ArrayList<>();

    public SoloEstudiante(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void matricularCurso() {
    }

    @Override
    public void entregarTarea() {

    }

    @Override
    public void iniciarSesion() {

    }

    @Override
    public void cerrarSesion() {

    }

    @Override
    public void printInfo() throws Exception {

    }
}
