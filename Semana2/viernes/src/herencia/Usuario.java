package herencia;

import java.util.ArrayList;

public class Usuario {
    String username;
    int id;
    ArrayList<LibraryItem> items;

    public Usuario(String username, int id){
        this.username = username;
        this.id = id;
        items = new ArrayList<>();
    }
}
