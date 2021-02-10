package EjercicioMinecraft;

public abstract class Herramienta extends Materiales {

    public Herramienta(String nombre, int masa, int capacidad_quemar, int capacidad_diluir) {
        super(nombre, masa, capacidad_quemar, capacidad_diluir);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
