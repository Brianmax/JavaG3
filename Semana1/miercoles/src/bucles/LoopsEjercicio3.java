package bucles;

import java.util.Scanner;

public class LoopsEjercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de n");

        int n = sc.nextInt();
        System.out.println("Solucion 1");
        for(int i = 0; i < n; i++)
        {
            if(i%2==0) // verificamos si es par
            {
                System.out.println(i);
            }
        }

        System.out.println("Solucion 2");

        for (int i = 0; i < n; i=i+2) {
            System.out.println(i);
        }
        System.out.println("Solucion bucle while");
        int j = 0;
        while(j<n){
            System.out.println(j);
            j = j + 2;
        }
    }
}
