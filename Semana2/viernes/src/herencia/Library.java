package herencia;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    ArrayList<LibraryItem> libraryItems;
    ArrayList<Usuario> users;

    // metodos
    // prestar
    // devolver
    // registrar usuario
    // eliminar usuario
    // buscar item

    public boolean prestamoLibro(int item_id, int user_id)
    {
        // buscar usuario
        Usuario userList = new Usuario();
        boolean isUserPresent = false;
        for(Usuario user: users){
            if(user.getId() == user_id)
            {
                isUserPresent = true;
                userList = user;
                break;
            }
        }
        if(isUserPresent==false)
        {
            System.out.println("El usuario no existe");
            return false;
        }


    }
}
