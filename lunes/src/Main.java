// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // tipos de datos
        /*
        int vidas = 3;
        char valor = 'a';
        String nombre = "George";
        System.out.println(vidas);
        System.out.println(valor);
        System.out.println(nombre);

        short num1 = 32767;
        byte num2 = 12;

        float alturaM = 1.733f;
        double factor = 0.23232323;
        */

        // Imprimir informacion

        String nombre = "George";
        String apellido = "Maxi";
        byte edad = 27;
        String ciudad = "Arequipa";
        float altura = 1.7f;

        // Mi nombre es "George"
        System.out.println("Mi nombre es "+nombre);

        // Operaciones con variables

        int num1 = 10;
        int num2 = 20;
        // suma
        int resultado = num1 + num2;
        System.out.println(resultado);
        // resta
        int resultado2 = num1 - num2;

        System.out.println(resultado2);

        num1 = num1+5;

        System.out.println(num1);

        num1 = 56;
        System.out.println(num1);

        String str1 = "Hola";
        String str2 = "Mundo";

        String result = str1+str2;
        System.out.println(result);

        final float PI = 3.14f;

        num1 = 10;
        num2 = 4;

        float resultadoDiv = (float) num1/num2;
        System.out.println("Division " + resultadoDiv);

        float num1F = 10;
        float num2F = 0;
        float resutadoF = num1F/num2F;
        System.out.println(resutadoF);

        // operador modulo

        num1 = 10;
        num2 = 3;
        System.out.println(num1%num2);

        // calcule el area de un rectangulo
        // base, altura
        // area = base*altura

        float base = 10.4f;
        float height = 4.2f;

        float area = base*height;

        System.out.println("El area es: " + area);

    }
}