package com.example.relacionesjpa.service;

import com.example.relacionesjpa.dto.ApoderadoDTO;
import com.example.relacionesjpa.mapper.ApoderadoMapper;
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
        ApoderadoDTO apoderadoDTO = ApoderadoMapper.INSTANCE.apoderadoToApoderadoDTO(apoderado);
        return new ResponseBase(201, "Apoderado creado", true, Optional.of(apoderadoDTO));
    }
    public Optional<Apoderado> findById(Integer id)
    {
        return apoderadoRepository.findById(id);
    }
}