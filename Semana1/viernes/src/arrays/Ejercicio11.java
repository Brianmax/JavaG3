package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de libros");
        int n_libros = sc.nextInt();
        System.out.println("Ingrese la cantidad de minutos");
        int t = sc.nextInt();

        int suma = 0;
        int maxLibros = 0;
        int ans = 0;
        int i = 0;
        ArrayList<Integer> tiemposLibros = new ArrayList<>();
        ArrayList<Integer> librosMaximos = new ArrayList<>();
        for(int j=0; j<n_libros; j++)
        {
            int tiempoLibro = sc.nextInt();
            tiemposLibros.add(tiempoLibro);
            suma = suma + tiempoLibro;
            if(suma > t)
            {
                suma = suma - tiemposLibros.get(i);
                i++;
            }
            else {
                ans++;
            }
            maxLibros = Math.max(maxLibros, ans);
            librosMaximos.add(maxLibros);
        }
        Collections.sort(librosMaximos);
        System.out.println(librosMaximos);
    }
}
