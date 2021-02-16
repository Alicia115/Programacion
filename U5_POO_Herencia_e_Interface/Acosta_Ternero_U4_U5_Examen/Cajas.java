import java.util.Arrays;

public class Cajas {

    private int id;
    private Prendas[] prenda;

    public Cajas(int id) {
        this.id = id;
        this.prenda = new Prendas[0];

    }

    public Prendas[] getPrenda() {
        return prenda;
    }

    public void setPrenda(Prendas[] prenda) {
        this.prenda = prenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addprenda (Prendas prendas){
        int contador=0;

        if(prenda.length<5){
            prenda= Arrays.copyOf(prenda, prenda.length+1);
            prenda[prenda.length-1]= prendas;
        } else{
            System.out.println("Ya no caben más prendas");
        }
        contador++;
    }

    public void deleteprenda(Prendas prendas){
        Prendas[] guardador = new Prendas[0];
        for (int i = 0; i < prenda.length; i++) {
            if(prenda[i]!=prendas){
                guardador= Arrays.copyOf(guardador, guardador.length+1);
                guardador[guardador.length-1]=prenda[i];
            }
        }
        prenda=guardador;
    }

    @Override
    public String toString() {
        String mensajePrenda = "";
        for (int i = 0; i < prenda.length; i++) {
            mensajePrenda+= prenda[i] + "\n";
        }

        return
                "  id caja: " + id + "\n" +
                "  prenda: " + mensajePrenda +"\n";
    }
}
