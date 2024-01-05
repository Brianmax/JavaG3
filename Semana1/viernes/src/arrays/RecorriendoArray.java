package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class RecorriendoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {12,23,12,44,2};
        /*
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("//////////////////////////");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        } */

        // inicializando valores

        /*int[] array2 = new int[5];
        int size = array2.length;

        for(int i=0; i < size; i++){
            System.out.println("Ingrese el valor para la posicion " + i);
            int valor = sc.nextInt();
            array2[i] = valor;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array2[i]);
        }
        */

        // array list insercion con for

        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = 5;

        for (int i = 0; i < size ; i++) {
            System.out.println("Ingrese el valor para la posicion " + i);
            int valor = sc.nextInt();
            arrayList.add(valor);
        }
    }
}
