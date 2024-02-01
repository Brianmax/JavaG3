package com.example.relacionesjpa.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstudianteDTO {
    private Integer idEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String emailEstudiante;
    @JsonIgnoreProperties("estudiantes")
    private ApoderadoDTO apoderadoDTO;
}
