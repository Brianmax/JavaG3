package com.example.springsabado.model;

import jakarta.persistence.GeneratedValue;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class PrestamoId implements Serializable {
    private Integer usuarioId;
    private Integer libroId;
}
