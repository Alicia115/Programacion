import java.util.Arrays;
import java.util.Comparator;

public class CamionPerchas extends Vehiculos{

    private prendaColgadas[] prendaColgada;
    private int numero_prenda;


    public CamionPerchas(String matricula, Conductor conductor, int carga_max) {
        super(matricula, conductor, carga_max);
        this.prendaColgada = new prendaColgadas[0];
        this.numero_prenda=0;
    }

    public prendaColgadas[] getPrendaColgada() {
        return prendaColgada;
    }

    public void setPrendaColgada(prendaColgadas[] prendaColgada) {
        this.prendaColgada = prendaColgada;
    }



    public void addPrendaColgada (prendaColgadas prenda){
        prendaColgada= Arrays.copyOf(prendaColgada, prendaColgada.length+1);
        prendaColgada[prendaColgada.length-1]= prenda;
        numero_prenda++;
    }

    public void deletePrendaColgada(prendaColgadas prenda){
        prendaColgadas[] guardador = new prendaColgadas[0];
        for (int i = 0; i < prendaColgada.length; i++) {
            if(prendaColgada[i]!=prenda){
                guardador= Arrays.copyOf(guardador, guardador.length+1);
                guardador[guardador.length-1]=prendaColgada[i];
            }
        }
        prendaColgada=guardador;
    }

    public void descargar(){
        System.out.println("Descargando " + Arrays.toString(prendaColgada));
    }


    @Override
    public String toString() {

        String mensajePrendaColgada = "";
        for (int i = 0; i < prendaColgada.length; i++) {
            mensajePrendaColgada+= prendaColgada[i]+"\n";
        }

        return "Camion de Perchas " +"\n" +
                super.toString()+ "\n" +
                " Prenda Colgada: " + mensajePrendaColgada;
    }
}
