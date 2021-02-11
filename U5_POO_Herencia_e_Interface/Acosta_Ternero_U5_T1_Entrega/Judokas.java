package U5_T1_Ej1;

public class Judokas extends Participantes implements Luchar{

    private int peso;

    public Judokas(String nombre_participante, int edad_participante, int peso) {
        super(nombre_participante, edad_participante);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void hacerJuramento() {
        System.out.println("Yo "+nombre_participante+", como judoka, juro los valores deportivos mundiales");
    }

    @Override
    public void luchar() {
        System.out.println("Voy a pelear" );
    }

    @Override
    public String toString() {
        return "Judoka "+ "\n"+
                super.toString() +"\n"+
                "  Peso= " + peso;
    }
}
