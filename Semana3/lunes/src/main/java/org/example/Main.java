package org.example;

import org.example.staticMethods.Calculadora;
import org.example.staticMethods.Usuario;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("George", 27);

        System.out.println(Usuario.contador);

        Usuario usuario2 = new Usuario("Jose", 12);

        System.out.println(Usuario.contador);
        System.out.println("////////////////////////////");
        System.out.println(usuario2.contador);
        System.out.println(usuario.contador);

        usuario.contador++;
        System.out.println("____________________________");
        System.out.println(Usuario.contador);
        System.out.println(usuario2.contador);
        System.out.println(usuario.contador);

        System.out.println("____________________________");
        Usuario.sumarUno();
        System.out.println(Usuario.contador);
        System.out.println(usuario2.contador);
        System.out.println(usuario.contador);
        System.out.println("++++++++++++++++++++");
        Calculadora.suma(2,3);
        Calculadora.resta(3,23);
        System.out.println(Calculadora.PI);
    }
}