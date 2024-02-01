package com.example.relacionesjpa.mapper;

import com.example.relacionesjpa.dto.EstudianteDTO;
import com.example.relacionesjpa.model.Estudiante;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EstudianteMapper {
    EstudianteMapper INSTANCE = Mappers.getMapper(EstudianteMapper.class);
    @Mapping(source = "id", target = "idEstudiante")
    @Mapping(source = "nombre", target = "nombreEstudiante")
    @Mapping(source = "apellido", target = "apellidoEstudiante")
    @Mapping(source = "email", target = "emailEstudiante")
    @Mapping(source = "apoderado", target = "apoderadoDTO")
    EstudianteDTO estudianteToEstudianteDTO(Estudiante estudiante, @Context CycleAvoidingMappingContext c);
}