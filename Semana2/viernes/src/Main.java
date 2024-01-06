import herencia.Book;
import herencia.DVD;
import herencia.LibraryItem;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(
                1,
                "El mundo que vimso arder",
                true,
                "Renato Cisneros");

        DVD dvd1 = new DVD(
                2,
                "DVD1",
                true,
                "James Gosling",
                (short) 120);

        Integer[] array = {1,3,44,23,23};
        for(Integer num: array)
        {
            System.out.println(num);
        }
    }

}