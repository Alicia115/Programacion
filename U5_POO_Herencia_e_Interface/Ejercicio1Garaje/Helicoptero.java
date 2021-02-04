package Ejercicio1Garaje;

public class Helicoptero extends Aereo{

    public Helicoptero(String nombre, int altitud, String oaci) {
        super(nombre, altitud, oaci);
    }

    @Override
    public String volando() {
        return this.getClass().getSimpleName()+
                "nombre='" + nombre + '\'' +
                ", altitud=" + altitud +
                '}';
    }

    @Override
    public String toString() {
        return super.toString()+
                "Helicoptero{}";
    }
}
