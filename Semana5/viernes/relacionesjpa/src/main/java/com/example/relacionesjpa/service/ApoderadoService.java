package com.example.relacionesjpa.service;

import com.example.relacionesjpa.model.Apoderado;
import com.example.relacionesjpa.repository.ApoderadoRepository;
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
    public Apoderado saveApoderado(Apoderado apoderado)
    {
        apoderado.setFechaCreacion(new Date());
        return apoderadoRepository.save(apoderado);
    }
    public Optional<Apoderado> findById(Integer id)
    {
        return apoderadoRepository.findById(id);
    }
}