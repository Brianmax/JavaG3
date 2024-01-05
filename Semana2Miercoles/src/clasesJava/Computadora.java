package clasesJava;

public class Computadora {
    public String marcaProcesador;
    public String marcaComputadora;
    public short almacenamiento;
    public byte ram;

    public Computadora(String marcaProcesador,
                       String marcaComputadora,
                       short almacenamiento,
                       byte ram)
    {
        this.marcaComputadora = marcaComputadora;
        this.almacenamiento = almacenamiento;
        this.marcaProcesador =  marcaProcesador;
        this.ram = ram;
    }
}
