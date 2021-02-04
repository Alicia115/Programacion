package Ejercicio1Garaje;

public class Motocicletas extends Terrestres {
    public Motocicletas(String nombre, String matricula, int año, Color color) {
        super(nombre, matricula, año, color);
    }

    @Override
    public String toString() {
        return "Motocicletas{" +
               super.toString();
    }
}
