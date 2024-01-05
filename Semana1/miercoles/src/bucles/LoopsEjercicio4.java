package bucles;

import java.util.Scanner;

public class LoopsEjercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de n");
        int n = sc.nextInt();

        int suma = 0;

        for(int i = 1; i <= n; i++){
            suma += i;
        }
        System.out.println(suma);
    }
}
