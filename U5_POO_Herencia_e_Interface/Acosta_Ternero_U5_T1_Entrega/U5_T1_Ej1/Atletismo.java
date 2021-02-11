package U5_T1_Ej1;

public class Atletismo extends Deporte{

    private int numero_pruebas;

    public Atletismo(String nombre, String pabellon, int numero_pruebas) {
        super(nombre, pabellon);
        this.numero_pruebas = numero_pruebas;
    }

    public int getNumero_pruebas() {
        return numero_pruebas;
    }

    public void setNumero_pruebas(int numero_pruebas) {
        this.numero_pruebas = numero_pruebas;
    }

    @Override
    public String toString() {
        return "Atletismo " + "\n"+
                super.toString()+ "\n"+
                "Numero de pruebas= " + numero_pruebas;
    }
}
