package org.example.ejemploInterfaces;

public class Profesor implements Usuario{
    @Override
    public void login() {
        System.out.println("Login profesor");
    }

    @Override
    public void logout() {
        System.out.println("Logout profesor");
    }
}
