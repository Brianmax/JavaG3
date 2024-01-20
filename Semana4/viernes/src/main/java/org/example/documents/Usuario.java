package org.example.documents;

import lombok.Getter;
import lombok.Setter;
import org.example.repository.ProductoRepository;

import java.util.List;

@Getter
@Setter
public class Usuario {
    String idUsuario;
    String nombre;
    String password;
    List<Producto> productos;
}