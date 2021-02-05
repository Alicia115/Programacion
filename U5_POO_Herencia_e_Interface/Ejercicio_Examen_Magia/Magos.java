package Ejercicio_Examen_Magia;

public class Magos extends Hombres{

    private int barba;

    public Magos(String nombre, int energia, int ataque, int defensa, int barba) {
        super(nombre, energia, ataque, defensa);

        this.barba=barba;
    }

    public int getBarba() {
        return barba;
    }

    public void setBarba(int barba) {
        this.barba = barba;
    }

    @Override
    public String toString() {
        return "Magos{" +
                "barba=" + barba +
                ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}
