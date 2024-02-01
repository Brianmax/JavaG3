package com.example.relacionesjpa.mapper;

import com.example.relacionesjpa.dto.ApoderadoDTO;
import com.example.relacionesjpa.model.Apoderado;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ApoderadoMapper {
    ApoderadoMapper INSTANCE = Mappers.getMapper(ApoderadoMapper.class);

    @Mapping(source = "apoderado.id", target = "id")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "apellido", target = "apellido")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "estudiantes", target = "estudiantes")
    ApoderadoDTO apoderadoToApoderadoDTO(Apoderado apoderado, @Context CycleAvoidingMappingContext c);
}
