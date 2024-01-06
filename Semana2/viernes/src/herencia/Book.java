package herencia;

public class Book extends LibraryItem{
    String autor;
    public Book(int id, String titulo, boolean disponible, String autor)
    {
        super(id, titulo, disponible);
        this.autor = autor;
    }
}
