package U5_T1_Ej1;

import java.util.Arrays;
import java.util.Comparator;

public class Pais implements Comparable<Pais> {

    private String nombre;
    private int numero_participante;

    public Pais(String nombre, int numero_participante) {
        this.nombre = nombre;
        this.numero_participante = numero_participante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_participante() {
        return numero_participante;
    }

    public void setNumero_participante(int numero_participante) {
        this.numero_participante = numero_participante;
    }

    @Override
    public int compareTo(Pais o) {
        return this.nombre.compareTo(o.nombre);
    }



    public static class comparar_num_participantes implements Comparator<Pais> {
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.numero_participante-o2.numero_participante;
        }
    }

    @Override
    public String toString() {

        return  super.toString()+ "\n"+
                "  Nombre= " + nombre +
                "  Numero de participante=" + numero_participante;
    }
}
