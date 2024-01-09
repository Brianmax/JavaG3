package org.example.clases;

import org.example.interfaces.Profesor;
import org.example.interfaces.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    List<SoloEstudiante> estudiantes = new ArrayList<>();
    List<EstudianteProfesor> estudianteProfesors = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();

    void agregarCurso(Curso curso)
    {
        cursos.add(curso);
    }
    void agregarUsuario(Usuario usuario)
    {
        if(usuario.getClass().getSimpleName().equals("SoloEstudiante"))
        {
            estudiantes.add((SoloEstudiante) usuario);
        }
        else {
            estudianteProfesors.add((EstudianteProfesor) usuario);
        }
    }
    void asignarProfesor(int id_profesor, String codigo_curso)
    {
        Curso cursoInstancia = new Curso();
        for(Curso curso: cursos )
        {
            if(curso.getCodigo().equals(codigo_curso))
            {
                cursoInstancia = curso;
                break;
            }
        }
        for(EstudianteProfesor profesor: estudianteProfesors)
        {
            if(profesor.getId()==id_profesor)
            {
                // asignamos el curso al profesor
                profesor.agregarCursoImpartido(cursoInstancia);
            }
        }
    }
}
