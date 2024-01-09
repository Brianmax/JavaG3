package org.example.ejemploInterfaces;

public class Estudiante implements Usuario{
    @Override
    public void login(){
        System.out.println("Login estudiante");
    }
    @Override
    public void logout()
    {
        System.out.println("Logout estudiante");
    }
}
