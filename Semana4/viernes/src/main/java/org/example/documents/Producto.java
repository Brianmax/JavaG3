package org.example.documents;

import lombok.Getter;
import lombok.Setter;
import org.bson.Document;

import javax.print.Doc;
import java.util.List;

@Getter
@Setter
public class Producto {
    String idProducto;
    String nombreProducto;
    Double precio;
    List<String> comentarios;

    public Document toDocument()
    {
        Document document = new Document();
        document.append("nombre_producto",this.nombreProducto);
        document.append("precio", this.precio);
        document.append("comentarios", this.comentarios);
        return document;
    }
}