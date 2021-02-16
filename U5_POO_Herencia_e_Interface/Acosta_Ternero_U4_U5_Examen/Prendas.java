public class Prendas implements Devolver {

    double precio;
    double peso;
    String nombre;
    int codigo;

    public Prendas(double precio, double peso, String nombre, int codigo) {
        this.precio = precio;
        this.peso = peso;
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void devolver(Prendas prenda) {
        System.out.println("Devolviendo la prenda con nombre " + nombre+ " y precio " +precio);
    }

    @Override
    public String toString() {
        return
                "  precio: " + precio + "\n" +
                "  peso: " + peso + "\n" +
                "  nombre: " + nombre + "\n" +
                "  codigo: " + codigo +"\n" ;
    }
}
