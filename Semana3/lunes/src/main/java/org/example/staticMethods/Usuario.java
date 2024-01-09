package org.example.staticMethods;

public class Usuario {
    String nombre;
    int edad;
    public static int contador = 0;
    public Usuario(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        contador++;
    }
    public static void sumarUno()
    {
        contador++;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Usuario.contador = contador;
    }
}
