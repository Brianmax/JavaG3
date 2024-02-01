package com.example.relacionesjpa.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstudianteDTO {
    private Integer idEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String emailEstudiante;
    private ApoderadoDTO apoderadoDTO;
}
