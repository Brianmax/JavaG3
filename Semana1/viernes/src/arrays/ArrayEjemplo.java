package arrays;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayEjemplo {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[2] = 10;
        array[4] = 56;
        // array[5] = 12; // error
        System.out.println(array[2]);

        int[] array2 = {1,2,1,23,32, 23,232};
        // array dinamico
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(190);
        arrayList.add(200);

        arrayList.remove(0);
        System.out.println(arrayList);
        // linked list

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);
        linkedList.add(89);
        linkedList.add(76);

        System.out.println(linkedList);

        String str = "Hola";
        str.concat("nueva info");
        System.out.println(str);

        System.out.println(array2.toString());
    }
}
