package U5_T1_Ej1;

import java.util.Arrays;

public abstract class Deporte  {

    protected String nombre;
    protected String pabellon;
    protected Participantes[] participantes;

    public Deporte(String nombre, String pabellon) {
        this.nombre = nombre;
        this.pabellon = pabellon;
        this.participantes = new Participantes[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPabellon() {
        return pabellon;
    }

    public void setPabellon(String pabellon) {
        this.pabellon = pabellon;
    }

    public Participantes[] getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Participantes[] participantes) {
        this.participantes = participantes;
    }

    public void addParticipantes (Participantes participante){
        participantes= Arrays.copyOf(participantes,participantes.length+1);
        participantes[participantes.length-1]= participante;
    }

    public void quitarParticipantes (Participantes participante){
        Participantes[] guardarparticipante= new Participantes[0];
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i]!= participante){
                guardarparticipante= Arrays.copyOf(guardarparticipante,guardarparticipante.length+1);
                guardarparticipante[guardarparticipante.length-1]= participantes[i];
            }
        }
        participantes=guardarparticipante;
    }

    public void mostrarParticipantes() {
        Arrays.sort(participantes);
        System.out.println(participantes);
    }


    @Override
    public String toString() {
        String participantesmensaje="";
        for (int i = 0; i < participantes.length; i++) {
            participantesmensaje += participantes[i] + "\n";
        }
        return super.toString()+"\n"+
                "  Nombre= " + nombre +"\n"+
                "  Pabellon= " + pabellon +"\n"+
                "  Participantes= " +"\n"+ participantesmensaje;
    }
}
