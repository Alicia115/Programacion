package Ejercicio1Garaje;

public class Coches extends Terrestres {
    public Coches(String nombre, String matricula, int año, Color color) {
        super(nombre,matricula, año, color);
    }

    @Override
    public String toString() {
        return "Coches{}"+
                super.toString()
                ;
    }
}
