package U5_T1_Ej1;

import java.util.Arrays;


public class Baloncesto extends Deporte{

    private int numero_equipos;

    public Baloncesto(String nombre, String pabellon, int numero_equipos) {
        super(nombre, pabellon);
        this.numero_equipos = numero_equipos;
    }

    public int getNumero_equipos() {
        return numero_equipos;
    }

    public void setNumero_equipos(int numero_equipos) {
        this.numero_equipos = numero_equipos;
    }

    public void mostrarJugadoresBaloncestoPorAltura(){
        Arrays.sort((Jugadores_baloncesto[]) participantes,new Jugadores_baloncesto.comparar_altura_baloncesto());
    }

    @Override
    public String toString() {
        return "Baloncesto " + "\n"+
                super.toString()+ "\n"+
                "  Numero de equipos= " + numero_equipos ;
    }
}
