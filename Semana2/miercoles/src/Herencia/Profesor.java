package Herencia;

public class Profesor extends Persona{
    private int numCursos;
    private int ranking;

    public Profesor(String nombre, String apellido, int numCursos, int ranking)
    {
        super(nombre, apellido);
        this.numCursos = numCursos;
        this.ranking = ranking;

    }
    @Override
    public void saludar(String nombre)
    {
        System.out.println("Bienvenido");
        System.out.println("Hola amigo/a" + nombre);
    }
}
