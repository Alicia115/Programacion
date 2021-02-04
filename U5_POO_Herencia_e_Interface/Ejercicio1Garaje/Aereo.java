package Ejercicio1Garaje;

public abstract class Aereo extends Vehiculo implements Volar{
    protected int altitud;
    protected String oaci;

    public Aereo(String nombre, int altitud, String oaci) {
        super(nombre);
        this.altitud = altitud;
        this.oaci = oaci;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Aereo{" +
                "altitud=" + altitud +
                ", oaci='" + oaci + '\'' +
                '}';
    }
}
