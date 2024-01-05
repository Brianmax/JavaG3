package arrays;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, t, suma=0, maxLibros=0, libros=0;
        System.out.print("n = ");
        n = sc.nextInt();
        System.out.print("t = ");
        t = sc.nextInt();
        int[] tiempos = new int[n];
        for (int i=0;i<n;i++) {
            System.out.print("tiempos["+i+"] = ");
            tiempos[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++) {
            suma=0;libros=0;
            for (int j=i;j<n;j++) {
                suma = suma + tiempos[j];
                if (suma <= t) {
                    libros = libros+1;
                }
            }
            if (libros >= maxLibros) {
                maxLibros = libros;
            }
        }
        System.out.println("\nLibros: "+maxLibros);
    }
}
