package Ejercicio_Examen_Magia;

public class Enanos extends Personaje{

    private int altura;

    public Enanos(String nombre, int energia, int ataque, int defensa, int altura) {
        super(nombre, energia, ataque, defensa);
        this.altura=altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Enanos{" +
                "altura=" + altura +
                ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}
