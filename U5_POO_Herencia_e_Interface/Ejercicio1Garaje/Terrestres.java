package Ejercicio1Garaje;

import java.util.Comparator;
import java.util.Objects;

public abstract class Terrestres extends Vehiculo implements Comparable <Terrestres> {

    protected String matricula;
    protected int year;
    protected Color color;

    public Terrestres(String nombre, String matricula, int year, Color color) {
        super(nombre);
        this.matricula = matricula;
        this.year = year;
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Terrestres that = (Terrestres) o;
        return matricula.equals(that.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Terrestres{" +
                "matricula='" + matricula + '\'' +
                ", year=" + year +
                ", color=" + color +
                '}';
    }

    @Override
    public int compareTo(Terrestres o) {

        return  this.matricula.compareTo(o.matricula);
    }

    public static class comparateyear implements Comparator<Terrestres> {

        @Override
        public int compare(Terrestres o1, Terrestres o2) {
            return o1.year-o2.year;
        }
    }
}
