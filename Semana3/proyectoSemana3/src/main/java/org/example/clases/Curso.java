package org.example.clases;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.interfaces.Estudiante;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
public class Curso {
    String codigo;
    String nombre;
    List<Estudiante> estudiantes;

    public Curso(String nombre, String codigo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void printCurso() throws Exception
    {
        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        String json = objectMapper.writeValueAsString(this);
        System.out.println(json);
    }
}
