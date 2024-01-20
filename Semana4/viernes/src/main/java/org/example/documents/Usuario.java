package org.example.documents;

import lombok.Getter;
import lombok.Setter;
import org.bson.Document;
import org.example.repository.ProductoRepository;

import java.util.List;

@Getter
@Setter
public class Usuario {
    String idUsuario;
    String nombre;
    String password;
    List<Producto> productos;
    List<Direccion> direccions;

    public Document toDocument()
    {
        Document document = new Document();
        document.append("nombre", this.nombre);
        document.append("password", this.password);
        document.append("productos", this.productos);
        document.append("direcciones", this.direccions);
        return document;
    }
}