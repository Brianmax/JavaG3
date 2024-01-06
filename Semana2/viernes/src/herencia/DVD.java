package herencia;

public class DVD extends LibraryItem {
    private String director;
    private short duracion;
    public DVD(int id, String titulo, boolean disponible, String director, short duracion) {
        super(id, titulo, disponible);
        this.director = director;
        this.duracion = duracion;
    }
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public short getDuracion() {
        return duracion;
    }

    public void setDuracion(short duracion) {
        this.duracion = duracion;
    }
}
