package U5_T1_Ej1;

import java.util.Comparator;

public class Jugadores_baloncesto extends Participantes implements Encestar{

    private double altura;

    public Jugadores_baloncesto(String nombre_participante, int edad_participante, double altura) {
        super(nombre_participante, edad_participante);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void hacerJuramento() {
        System.out.println( "Yo "+nombre_participante+", como jugador de baloncesto, juro los valores deportivos mundiales");
    }

    @Override
    public void encestar() {
        System.out.println("2 puntos!!!!!");
    }

    public static class comparar_altura_baloncesto implements Comparator<Jugadores_baloncesto> {
        @Override
        public int compare(Jugadores_baloncesto o1, Jugadores_baloncesto o2) {
            return (int) (o1.altura-o2.altura);
        }
    }

    @Override
    public String toString() {
        return
                "Jugador de Baloncesto "+ "\n"+
                super.toString() +"\n"+
                "  Altura= " + altura;
    }
}
