package org.example.documents;

import lombok.Getter;
import lombok.Setter;
import org.bson.Document;
import org.bson.types.ObjectId;

import javax.print.Doc;
import java.util.List;

@Getter
@Setter
public class Producto {
    ObjectId idProducto;
    String nombreProducto;
    Double precio;
    List<ObjectId> comentarios;
    public Document toDocument()
    {
        Document document = new Document();
        document.append("nombre_producto",this.nombreProducto);
        document.append("precio", this.precio);
        document.append("comentarios", this.comentarios);
        return document;
    }
    public static Producto fromDocument(Document document)
    {
        Producto producto = new Producto();
        producto.setIdProducto(document.getObjectId("_id"));
        producto.setNombreProducto(document.getString("nombre_producto"));
        producto.setPrecio(document.getDouble("precio"));
        producto.setComentarios(document.getList("comentarios", ObjectId.class));
        return producto;
    }
}