package clasesJava;


import java.util.Date;

public class Administrador {
    String nombre;
    String apellido;
    Date fechaNacimiento;
    byte edad;
    String role = "Admin";

    public Administrador(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Administrador(String nombre, String apellido, byte edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Administrador(){

    }
}
