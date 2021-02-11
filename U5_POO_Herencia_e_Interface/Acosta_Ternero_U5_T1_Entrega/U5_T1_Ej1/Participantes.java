package U5_T1_Ej1;

public abstract class Participantes  implements Comparable<Participantes>{

    protected String nombre_participante;
    protected int edad_participante;

    public Participantes(String nombre_participante, int edad_participante) {
        this.nombre_participante = nombre_participante;
        this.edad_participante = edad_participante;
    }

    public String getNombre_participante() {
        return nombre_participante;
    }

    public void setNombre_participante(String nombre_participante) {
        this.nombre_participante = nombre_participante;
    }

    public int getEdad_participante() {
        return edad_participante;
    }

    public void setEdad_participante(int edad_participante) {
        this.edad_participante = edad_participante;
    }

    public abstract void hacerJuramento();

    @Override
    public int compareTo(Participantes o) {
        return o.edad_participante-this.edad_participante;
    }


    @Override
    public String toString() {
        return super.toString()+ "\n"+
                " Nombre del participante= " + nombre_participante +
                " Edad= " + edad_participante ;
    }
}
