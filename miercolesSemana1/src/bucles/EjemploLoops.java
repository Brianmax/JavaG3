package bucles;

public class EjemploLoops {
    public static void main(String[] args) {

        for(int i = 0; i<10; i++)
        {
            System.out.println(i);
        }

        System.out.println("Aumentando de 5 en 5");

        int num1 = 10;
        for (int i=0; i<20; i+=5){
            System.out.println(i);
        }

        // bucle while

        System.out.println("Ejecutando bucle while");
        int j = 0;
        while(j<10)
        {
            System.out.println(j);
            j++;
        }
    }
}
