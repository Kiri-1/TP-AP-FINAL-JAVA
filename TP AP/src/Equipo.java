public class Equipo {

    private String nombre;
    private String descripcion;

    //Constructor
    public Equipo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //get and set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String toString() {
        return "Equipos [Nombre=" + nombre + ", Descripcion=" + descripcion + "]";
    }
}
