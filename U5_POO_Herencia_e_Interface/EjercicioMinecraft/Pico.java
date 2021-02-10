package EjercicioMinecraft;

import cubo.Material;

public class Pico extends Herramienta implements Minar {

    private double grosor;

    public Pico(String nombre, int masa, int capacidad_quemar, int capacidad_diluir, double grosor) {
        super(nombre, masa, capacidad_quemar, capacidad_diluir);
        this.grosor = grosor;
    }

    public double getGrosor() {
        return grosor;
    }

    public void setGrosor(double grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Pico " +
                "grosor=" + grosor +
                super.toString();
    }
}
