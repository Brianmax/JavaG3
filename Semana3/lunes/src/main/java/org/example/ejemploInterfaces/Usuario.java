package org.example.ejemploInterfaces;

public interface Usuario {
    void login();
    void logout();

    default void saludar()
    {
        System.out.println("Hola");
    }
}
