import Herencia.Profesor;
import clasesJava.Administrador;
import clasesJava.Computadora;
import clasesJava.Perro;
import indicesAcceso.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*String str = "hola";
        Usuario user1 = new Usuario();
        Usuario user2 = new Usuario();

        user1.nombre = "George";
        user2.nombre = "Andres";

        user1.edad = 27;
        user2.edad = 32;

        user1.email = "email@gmail.com";
        user2.email = "a.email@gmail.com";

        // computadora

        Computadora computadora1 = new Computadora();

        computadora1.marcaProcesador = "Intel";
        computadora1.almacenamiento = 512;
        computadora1.ram = 8;
        computadora1.marcaComputadora = "Hp";
         */
        Perro perro1 = new Perro("Chester", "Pastor Aleman", (byte) 3);

        Computadora computadora1 = new Computadora("Intel",
                "Lenovo",
                (short) 512,
                (byte) 8);
        Administrador admin1 = new Administrador("George", "Maxi");
        Administrador admin2 = new Administrador("Jose", "Canales");
        Administrador admin3 = new Administrador("Juan", "Beltran", (byte) 34);
        Administrador admin4 = new Administrador();

        Gato gato1 = new Gato("Michi", "Blanco");
        System.out.println(gato1.getNombre());
        System.out.println(gato1.getColor());

        // setters

        gato1.setNombre("Luna");
        gato1.setColor("Crema");

        System.out.println(gato1.getNombre());
        System.out.println(gato1.getColor());
        // clase Math
        gato1.saludar();
        gato1.saludarPersona("Jose");
        gato1.saludarPersona("Jorge");

        // calculadora
        Calculadora calculadora = new Calculadora();
        float suma = calculadora.sumar(4,5);
        System.out.println(suma);

        Profesor profesor = new Profesor("Erik", "Gomez", 3, 70);
    }
}