package com.example.relacionesjpa.service;

import com.example.relacionesjpa.dto.ApoderadoDTO;
import com.example.relacionesjpa.mapper.ApoderadoMapper;
import com.example.relacionesjpa.mapper.CycleAvoidingMappingContext;
import com.example.relacionesjpa.model.Apoderado;
import com.example.relacionesjpa.repository.ApoderadoRepository;
import com.example.relacionesjpa.response.ResponseBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

@Service
public class ApoderadoService {
    private ApoderadoRepository apoderadoRepository;
    @Autowired
    private CycleAvoidingMappingContext cycleAvoidingMappingContext;
    public ApoderadoService(ApoderadoRepository apoderadoRepository)
    {
        this.apoderadoRepository = apoderadoRepository;
    }
    public ResponseBase saveApoderado(Apoderado apoderado)
    {
        // verificar que el apoderado no exista
        Optional<Apoderado> apoderadoBd = apoderadoRepository.findByEmail(apoderado.getEmail());
        if(apoderadoBd.isPresent())
        {
            return new ResponseBase(400,
                    "Apoderado con el email" + apoderado.getEmail()+" ya existe",
                    false,
                    Optional.empty());
        }
        apoderado.setFechaCreacion(new Date());
        apoderado.setRole("ROLE_APODERADO");
        apoderadoRepository.save(apoderado);
        ApoderadoDTO apoderadoDTO = ApoderadoMapper.INSTANCE.apoderadoToApoderadoDTO(apoderado, cycleAvoidingMappingContext);
        return new ResponseBase(201, "Apoderado creado", true, Optional.of(apoderadoDTO));
    }
    public ResponseBase findById(Integer id)
    {
        // buscamos el apoderado
        Optional<Apoderado> apoderadoBd = apoderadoRepository.findById(id);
        if(apoderadoBd.isPresent())
        {
            Apoderado apoderadoEntity = apoderadoBd.get();
            ApoderadoDTO apoderadoDTO = ApoderadoMapper.INSTANCE.apoderadoToApoderadoDTO(apoderadoEntity, cycleAvoidingMappingContext);
            return new ResponseBase(200,
                    "Apoderado encontrado",
                    true,
                    Optional.of(apoderadoDTO));
        }
        return new ResponseBase(404, "Apoderado no existe", false, Optional.empty());
    }
}