package com.example.relacionesjpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class CarroDTO {
    public String marcaCarro;
    public int numeroAsientos;
    public double precioCarro;
}
