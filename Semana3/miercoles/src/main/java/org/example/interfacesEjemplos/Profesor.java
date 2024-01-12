package org.example.interfacesEjemplos;

public class Profesor implements Usuario, Cliente{
    @Override
    public void login() {
        System.out.println("Login Profesor");
    }

    @Override
    public void logout() {
        System.out.println("Logout Profesor");
    }

    @Override
    public void cambiarPassword(String password) {
        System.out.println("Cambio de password Profesor");
    }

    @Override
    public void comprar() {

    }

    @Override
    public void devolver() {

    }
}
