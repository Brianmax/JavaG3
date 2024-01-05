package bucles;

import java.util.Scanner;

public class LoopsEjercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de n");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
