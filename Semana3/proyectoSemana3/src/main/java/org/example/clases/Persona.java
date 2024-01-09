package org.example.clases;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.interfaces.Usuario;

@Getter
@Setter
@AllArgsConstructor
public abstract class Persona implements Usuario {
    protected int id;
    protected String nombre;
}
