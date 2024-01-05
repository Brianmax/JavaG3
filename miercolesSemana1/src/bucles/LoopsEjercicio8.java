package bucles;

import java.util.Scanner;

public class LoopsEjercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de n");
        int n = sc.nextInt();

        while(n!=1){
            System.out.println(n);
            if(n%2!=0)
            {
                n = 3*n+1;
            }
            else {
                n = n/2;
            }
        }
    }
}
