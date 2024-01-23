package org.example.documents;

import lombok.Getter;
import lombok.Setter;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.example.repository.ProductoRepository;

import java.util.List;

@Getter
@Setter
public class Usuario {
    ObjectId idUsuario;
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
    public static Usuario fromDocument(Document document)
    {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(document.getObjectId("_id"));
        usuario.setNombre(document.getString("nombre"));
        usuario.setPassword(document.getString("password"));
        usuario.setProductos(document.getList("productos", Producto.class));
        usuario.setDireccions(document.getList("direcciones", Direccion.class));
        return usuario;
    }
}