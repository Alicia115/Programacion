package EjercicioMinecraft;

public class Sierra extends Herramienta{

    private double diametro;

    public Sierra(String nombre, int masa, int capacidad_quemar, int capacidad_diluir, double diametro) {
        super(nombre, masa, capacidad_quemar, capacidad_diluir);
        this.diametro = diametro;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        return "Sierra " +
                "diametro=" + diametro +
                super.toString();
    }
}
