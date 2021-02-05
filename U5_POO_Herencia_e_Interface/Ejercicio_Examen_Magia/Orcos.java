package Ejercicio_Examen_Magia;

public class Orcos extends Personaje {

    private int tonelaje;


    public Orcos(String nombre, int energia, int ataque, int defensa, int tonelaje) {
        super(nombre, energia, ataque, defensa);

        this.tonelaje=tonelaje;
    }

    public int getTonelaje() {
        return tonelaje;
    }

    public void setTonelaje(int tonelaje) {
        this.tonelaje = tonelaje;
    }

    @Override
    public String toString() {
        return "Orcos{" +
                "tonelaje=" + tonelaje +
                ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}
