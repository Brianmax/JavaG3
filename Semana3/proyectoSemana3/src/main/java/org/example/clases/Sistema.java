package org.example.clases;

import org.example.interfaces.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    List<Usuario> usuarios = new ArrayList<>();
    List<Curso> cursos = new ArrayList<>();

    void addCurso(Curso curso)
    {
        cursos.add(curso);
    }
}
