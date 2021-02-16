public class Conductor {

    String nombre;
    String apellidos;
    int NSS;

    public Conductor(String nombre, String apellidos, int NSS) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.NSS = NSS;
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

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int NSS) {
        this.NSS = NSS;
    }

    @Override
    public String toString() {
        return
                "  nombre: " + nombre + "\n" +
                "  apellidos: " + apellidos + "\n" +
                "  NSS: " + NSS ;
    }
}
