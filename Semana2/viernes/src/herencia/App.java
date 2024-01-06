package herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // instanciamos library
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Jorge", 1));
        usuarios.add(new Usuario("Juan", 2));
        usuarios.add(new Usuario("Pedro", 3));
        usuarios.add(new Usuario("Maria", 4));

        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book(1, "El mundo que vimso arder", true, "Renato Cisneros"));
        libraryItems.add(new Book(2, "La fiesta del chivo", true, "Mario Vargas Llosa"));
        libraryItems.add(new DVD(3, "Spiderman", true, "Sam Raymi", (short) 120));
        libraryItems.add(new DVD(4, "Avengers", true, "James Gosling", (short) 120));

        Library library = new Library("Mario Vargas Llosa", libraryItems, usuarios);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1. Prestamo");
            int option = sc.nextInt();
            if(option==1)
            {
                System.out.println("Ingrese el id del usuario");
                int id_user = sc.nextInt();
                System.out.println("Ingrese el id del item");
                int id_item = sc.nextInt();

                library.prestamo(id_item, id_user);
            }
        }
    }
}
