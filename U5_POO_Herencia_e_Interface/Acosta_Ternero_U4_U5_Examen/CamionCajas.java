import java.util.Arrays;

public class CamionCajas extends Vehiculos implements Comparable<CamionCajas>{

    private Cajas[] caja;


    public CamionCajas(String matricula, Conductor conductor, int carga_max) {
        super(matricula, conductor, carga_max);
        this.caja = new Cajas[0];

    }

    public Cajas[] getCaja() {
        return caja;
    }

    public void setCaja(Cajas[] caja) {
        this.caja = caja;
    }


    public void addcaja (Cajas cajas){
        caja= Arrays.copyOf(caja, caja.length+1);
        caja[caja.length-1]= cajas;

    }

    public void deletecaja(Cajas cajas){
        Cajas[] guardador = new Cajas[0];
        for (int i = 0; i < caja.length; i++) {
            if(caja[i]!=cajas){
                guardador= Arrays.copyOf(guardador, guardador.length+1);
                guardador[guardador.length-1]=caja[i];
            }
        }
        caja=guardador;
    }

    public void descargar(){
        System.out.println("Descargando " + Arrays.toString(caja));
    }

    @Override
    public int compareTo(CamionCajas o) {
        return o.carga_max-this.carga_max;
    }


    public void mostrarComparable(){
        Arrays.sort(caja);
        System.out.println(caja);
    }

    @Override
    public String toString() {

        String mensajeCaja = "";

        for (int i = 0; i < caja.length; i++) {
            mensajeCaja+= caja[i]+ "\n";
        }

        return  "Camión de Caja " +"\n" +
                super.toString() + "\n" +
                " Caja: " + mensajeCaja;
    }
}
