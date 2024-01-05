package clasesJava;

public class Usuario {
    // atributos

    public String nombre;
    public byte edad;
    public String email;


    // metodos

    public Usuario(String nombre, byte edad, String email)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public void saludar(){
        System.out.println("Bienvenido!!!");
        System.out.println("Hola a todos");
    }
}
