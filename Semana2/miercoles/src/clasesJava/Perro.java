package clasesJava;

public class Perro {
    private String nombre;
    private String raza;
    private byte edad;

    public Perro(String nombre, String raza, byte edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    // metodos

    public void ladrar()
    {
        System.out.println("guau guau");
    }
    public void comer(){
        System.out.println("perro comiendo");
    }
}
