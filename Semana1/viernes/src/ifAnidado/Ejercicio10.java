package ifAnidado;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura");

        float temperatura = sc.nextFloat();

        if(temperatura < 0)
        {
            System.out.println("Hace mucho frio");
        }
        else if(temperatura < 10 )
        {
            System.out.println("Hace frio");
        }
        else if (temperatura < 20)
        {
            System.out.println("El clima es fresco");
        }
        else if (temperatura < 30)
        {
            System.out.println("El clima es templado");
        }
        else {
            System.out.println("Hace calor");
        }
    }
}
