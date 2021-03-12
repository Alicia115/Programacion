import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Alumnos implements Serializable, Comparable<Alumnos>{

    private String nombre;
    private String apellidos;
    private String dni;
    private int id;
    private static int generador_id = 1;
    private String unidad;

    public Alumnos(String nombre, String apellidos, String dni, int id, String unidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.id = generador_id;
        generador_id++;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Alumnos " + "\n"+
                "  Nombre: " + nombre + "\n"+
                "  Apellidos: " + apellidos + "\n"+
                "  dni: " + dni + "\n"+
                "  Id: " + id +
                "  Unidad: " + unidad;
    }

    @Override
    public int compareTo(Alumnos o) {
        return this.dni.compareTo(o.dni);
    }

}
