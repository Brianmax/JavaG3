package herencia;

public class Book extends LibraryItem{
    private String autor;
    public Book(int id, String titulo, boolean disponible, String autor)
    {
        super(id, titulo, disponible);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
