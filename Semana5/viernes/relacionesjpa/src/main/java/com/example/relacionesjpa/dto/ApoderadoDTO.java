package com.example.relacionesjpa.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SecondaryRow;

import java.util.List;
@Getter
@Setter
public class ApoderadoDTO {
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private List<EstudianteDTO> estudiantes;
}