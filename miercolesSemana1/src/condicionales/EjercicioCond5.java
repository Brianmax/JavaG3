package condicionales;

import java.util.Scanner;

public class EjercicioCond5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la nota de matematica");
        int notaMat = sc.nextInt();
        System.out.println("Ingrese la nota de fisica");
        int notaFis = sc.nextInt();
        System.out.println("Ingrese la nota de quimica");
        int notaQui = sc.nextInt();

        if((notaMat>=65 && notaFis>=55 && notaQui>=50) || (notaFis+ notaMat)>= 140)
        {
            System.out.println("El alumno ingreso");
        }
        else {
            System.out.println("El alumno no ingreso");
        }
        sc.close();
    }
}
