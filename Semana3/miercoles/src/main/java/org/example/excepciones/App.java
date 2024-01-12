package org.example.excepciones;

import java.io.FileReader;

public class App {
    public static void main(String[] args) {

    }
    public static void ejemplo1()
    {
        int[] numeros = {1,2,3,4,5};
        try
        {
            System.out.println(numeros[5]);
        }
        catch (Exception e)
        {
            System.out.println("Error en la ejecucion");
            System.out.println(e.getMessage());
        }
        System.out.println("Hola mundo");
    }
    public static void ejemplo2(String path) throws Exception
    {
        FileReader fr = new FileReader(path);
    }
}
