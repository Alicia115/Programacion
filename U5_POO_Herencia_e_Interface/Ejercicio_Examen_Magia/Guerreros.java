package Ejercicio_Examen_Magia;

public class Guerreros extends Hombres{

    private int edad;

    public Guerreros(String nombre, int energia, int ataque, int defensa, int edad) {
        super(nombre, energia, ataque, defensa);

        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Guerreros{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}
