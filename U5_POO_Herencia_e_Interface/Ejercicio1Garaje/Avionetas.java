package Ejercicio1Garaje;

public class Avionetas extends Aereo {


    public Avionetas(String nombre, int altitud, String oaci) {
        super(nombre,altitud, oaci);
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
                "Avionetas{}";
    }
}
