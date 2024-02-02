package com.example.examen.service;

import com.example.examen.model.Reserva;
import com.example.examen.repository.ReservaRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    public Reserva saveReserva(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    public Optional<Reserva> getReservaById(Integer id) {
        return reservaRepository.findById(id);
    }
}
