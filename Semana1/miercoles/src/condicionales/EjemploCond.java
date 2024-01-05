package condicionales;

public class EjemploCond {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        // condicional

        if(num1 < num2){
            System.out.println("Num1 es menor que num 2");
        }
        else {
            System.out.println("Num2 es menor");
        }

        // dado un numero, verificar si es par o no
        int numero = 11;
        if(numero%2==0)
        {
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }


        System.out.println("Fin del programa");
    }
}
