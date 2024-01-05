package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio11Pdf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de libros");
        int n_libros = sc.nextInt();
        System.out.println("Ingrese la cantidad de minutos");
        int t = sc.nextInt();

        int[] tiemposLibros = new int[n_libros];

        for(int i=0; i<n_libros; i++)
        {
            System.out.println("Ingrese el tiempo del libro");
            tiemposLibros[i] = sc.nextInt();
        }
        // logica
        ArrayList<Integer> librosMaximo = new ArrayList<>();
        int suma = 0;
        int maxLibros = 0;
        int j = 0;
        for(int i = 0; i < n_libros; i++)
        {
            suma = suma + tiemposLibros[i];
            if(suma > t){
                librosMaximo.add(maxLibros);
                suma = suma - tiemposLibros[j];
                j++;
            }
            else{
                maxLibros++;
            }
        }

        Collections.sort(librosMaximo);
        System.out.println(librosMaximo);
    }
}
