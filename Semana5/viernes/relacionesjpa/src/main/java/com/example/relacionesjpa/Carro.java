package com.example.relacionesjpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
// Entity
public class Carro {
    private String marca;
    private int numAsientos;
    private double precio;
    private int kilometraje;
    private int puertas;
}
