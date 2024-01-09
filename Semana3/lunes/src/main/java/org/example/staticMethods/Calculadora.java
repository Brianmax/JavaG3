package org.example.staticMethods;

public class Calculadora {
    public static final float PI = 3.14f;
    public static float num1;
    static
    {
        System.out.println("hola desde static");
        num1 = 10;
    }
    public static float suma(float a, float b)
    {
        return a + b;
    }
    public static float resta(float a, float b)
    {
        return a - b;
    }
}
