package org.example.interfacesEjemplos;

public interface Usuario {
    void login();
    void logout();
    void cambiarPassword(String password);
    default void saludar()
    {
        System.out.println("Hola, bienvenido al sistema");
    }
}
