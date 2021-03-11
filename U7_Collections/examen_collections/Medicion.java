package Examemenes.examen_collections;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

public class Medicion implements Comparable<Medicion>, Serializable {

    int temperatura;
    int humedad;
    int presion;

    public Medicion(int temperatura, int humedad, int presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicion medicion = (Medicion) o;
        return temperatura == medicion.temperatura &&
                humedad == medicion.humedad &&
                presion == medicion.presion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatura, humedad, presion);
    }

    @Override
    public int compareTo(Medicion o) {
        return this.temperatura-o.temperatura;
    }

    public static class ordenarDesc implements Comparator<Medicion>{

        @Override
        public int compare(Medicion o1, Medicion o2) {
            return o2.humedad-o1.humedad;
        }
    }

    @Override
    public String toString() {
        return "Medicion " +
                "  temperatura: " + temperatura +
                "  humedad: " + humedad +
                "  presion: " + presion ;
    }
}
