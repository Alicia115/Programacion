package EjercicioMinecraft;

import java.util.Comparator;
import java.util.Objects;

public abstract class Materiales implements Comparable<Materiales>{

    protected String nombre;
    protected int masa;
    protected int capacidad_quemar;
    protected int capacidad_diluir;
    protected boolean movible;

    public Materiales(String nombre, int masa, int capacidad_quemar, int capacidad_diluir) {
        this.nombre = nombre;

        if(masa>0 && masa<1000){
            this.masa = masa;
        } else{
            this.masa= (int) Math.random()*(1000-1)+1;
        }

        if(capacidad_quemar>0 && capacidad_quemar<100){
            this.capacidad_quemar = capacidad_quemar;
        } else{
            this.masa= (int) Math.random()*(1000-1)+1;
        }

        if(capacidad_diluir>0 && capacidad_diluir<100){
            this.capacidad_diluir = capacidad_diluir;
        } else{
            this.capacidad_diluir = (int) Math.random()*(1000-1)+1;
        }

        this.movible = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getCapacidad_quemar() {
        return capacidad_quemar;
    }

    public void setCapacidad_quemar(int capacidad_quemar) {
        this.capacidad_quemar = capacidad_quemar;
    }

    public int getCapacidad_diluir() {
        return capacidad_diluir;
    }

    public void setCapacidad_diluir(int capacidad_diluir) {
        this.capacidad_diluir = capacidad_diluir;
    }

    public boolean isMovible() {
        return movible;
    }

    public void setMovible(boolean movible) {
        this.movible = movible;
    }

    @Override
    public int compareTo(Materiales o) {
        return o.masa-this.masa;
    }


    @Override
    public String toString() {
        return
                "  nombre= " + nombre +
                "  masa= " + masa +
                "  capacidad de quemar= " + capacidad_quemar +
                "  capacidad de diluir= " + capacidad_diluir +
                "  movible= " + movible ;
    }


    public static class comparardiluir implements Comparator<Materiales> {

        @Override
        public int compare(Materiales o1, Materiales o2) {
            return o1.getCapacidad_diluir()-o2.getCapacidad_diluir();
        }
    }

    public static class compararquemar implements Comparator<Materiales>{

        @Override
        public int compare(Materiales o1, Materiales o2) {
            return o1.getCapacidad_quemar()-o2.getCapacidad_quemar();
        }
    }

}
