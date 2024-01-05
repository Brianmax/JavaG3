package indicesAcceso;
public class Gato {
    private String nombre; // default
    private String color;
    private String nombreDuenio;

    public Gato(String nombre, String color, String nombreDuenio) {
        this.nombre = nombre;
        this.color = color;
        this.nombreDuenio = nombreDuenio;
    }

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    public Gato()
    {}
    // metodo
    public void saludar()
    {
        System.out.println("Hola soy el gato");
    }
    public void saludarPersona(String nombre){
        System.out.println("Hola " + nombre);
    }
    // getters y setters
    public String getNombre()
    {
        return nombre;
    }
    public String getNombreDuenio()
    {
        return nombreDuenio;
    }
    public String getColor()
    {
        return color;
    }
    // setters
    public void setNombre(String nombre)
    {
        // logica
        this.nombre = nombre;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setNombreDuenio(String nombreDuenio)
    {
        this.nombreDuenio = nombreDuenio;
    }
}
