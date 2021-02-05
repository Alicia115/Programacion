package Ejercicio_Examen_Magia;

public class Elfos extends Personaje{

    private Tipo tipo;

    public Elfos(String nombre, int energia, int ataque, int defensa, Tipo tipo) {
        super(nombre, energia, ataque, defensa);
        this.tipo=tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Elfos{" +
                "tipo=" + tipo +
                ", nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}
