package U5_T1_Ej1;

public class Atletas extends Participantes implements Correr{

    private String nombre_prueba;

    public Atletas(String nombre_participante, int edad_participante, String nombre_prueba) {
        super(nombre_participante, edad_participante);
        this.nombre_prueba = nombre_prueba;
    }

    public String getNombre_prueba() {
        return nombre_prueba;
    }

    public void setNombre_prueba(String nombre_prueba) {
        this.nombre_prueba = nombre_prueba;
    }

    @Override
    public void hacerJuramento() {
        System.out.println( "Yo "+nombre_participante+", como atleta, juro los valores deportivos mundiales");
    }

    @Override
    public void correr() {
        System.out.println("Voy a correr");
    }

    @Override
    public String toString() {
        return "Atleta "+ "\n"+
                super.toString() +"\n"+
                "  Nombre de la prueba= " + nombre_prueba ;
    }
}
