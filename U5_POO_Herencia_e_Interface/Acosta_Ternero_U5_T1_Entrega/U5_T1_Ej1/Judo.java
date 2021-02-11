package U5_T1_Ej1;

public class Judo extends Deporte{

    private  int numero_tatamis;

    public Judo(String nombre, String pabellon, int numero_tatamis) {
        super(nombre, pabellon);
        this.numero_tatamis = numero_tatamis;
    }

    public int getNumero_tatamis() {
        return numero_tatamis;
    }

    public void setNumero_tatamis(int numero_tatamis) {
        this.numero_tatamis = numero_tatamis;
    }

    @Override
    public String toString() {
        return "Judo " + "\n"+
                super.toString()+ "\n"+
                "  Numero de tatamis=" + numero_tatamis;
    }
}
