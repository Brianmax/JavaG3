package org.example.clases;

import com.fasterxml.jackson.databind.SerializationFeature;
import org.example.interfaces.Estudiante;
import org.example.interfaces.Profesor;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
public class EstudianteProfesor extends Persona implements Profesor, Estudiante {
    List<Curso> cursosInscritos = new ArrayList<>();
    List<Curso> cursosImpartidos = new ArrayList<>();

    public EstudianteProfesor(int id, String nombre) {
        super(id, nombre);
    }

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
    public void agregarCursoImpartido(Curso curso)
    {
        cursosImpartidos.add(curso);
    }

    @Override
    public void iniciarSesion() {

    }

    @Override
    public void cerrarSesion() {

    }

    @Override
    public void printInfo() throws Exception{
        System.out.println("Estudiante-profesor");
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        String json = objectMapper.writeValueAsString(this);
        System.out.println(json);
    }
}
