package org.example;

import org.example.clases.Curso;
import org.example.clases.EstudianteProfesor;
import org.example.clases.Sistema;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.agregarUsuario(new EstudianteProfesor(1, "Juan"));
        sistema.agregarUsuario(new EstudianteProfesor(2, "Pedro"));
        sistema.agregarUsuario(new EstudianteProfesor(3, "Maria"));
        sistema.agregarUsuario(new EstudianteProfesor(4, "Jose"));

        sistema.agregarCurso(new Curso("Programacion", "C392"));
        sistema.agregarCurso(new Curso("Matematicas", "M299"));
        sistema.agregarCurso(new Curso("Fisica", "F392"));
        sistema.agregarCurso(new Curso("Quimica", "Q392"));

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Asignar profesor a curso");
            System.out.println("2. Matricular estudiante a curso");
            System.out.println("3. Calificar estudiante");
            System.out.println("4. Mostrar curso");
            System.out.println("5. Mostrar usuario");
            System.out.println("6. Salir");

            int opcion = scanner.nextInt();

            if(opcion == 1)
            {
                System.out.println("Ingrese el id del profesor");
                int id_profesor = scanner.nextInt();
                System.out.println("Ingrese el id del curso");
                String id_curso = scanner.next();
                sistema.asignarProfesor(id_profesor, id_curso);
            } else if (opcion == 4) {
                System.out.println("Ingresa el codigo del curso");
                String codigo = scanner.next();

            }
        }
    }
}