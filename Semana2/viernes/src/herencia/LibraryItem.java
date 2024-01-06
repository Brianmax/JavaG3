package herencia;

public class LibraryItem {
    protected int id;
    protected String titulo;
    protected boolean disponible;

    public LibraryItem(int id, String titulo, boolean disponible)
    {
        this.id = id;
        this.titulo = titulo;
        this.disponible = disponible;
    }

    public LibraryItem() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
