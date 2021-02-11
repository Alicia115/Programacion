package U5_T1_Ej1;

import java.util.Arrays;

public class ATRIOS {

    private Edicio_Juego_Deportivos[] ediciones;

    public ATRIOS(Edicio_Juego_Deportivos[] ediciones) {
        this.ediciones = new Edicio_Juego_Deportivos[0];
    }

    public Edicio_Juego_Deportivos[] getEdiciones() {
        return ediciones;
    }

    public void setEdiciones(Edicio_Juego_Deportivos[] ediciones) {
        this.ediciones = ediciones;
    }

    public void addEdiciones (Edicio_Juego_Deportivos edicion){
        ediciones= Arrays.copyOf(ediciones, ediciones.length+1);
        ediciones[ediciones.length-1]= edicion;
    }

    public void quitarEdicion (Edicio_Juego_Deportivos edicion){
        Edicio_Juego_Deportivos[] guardaredicion= new Edicio_Juego_Deportivos[0];
        for (int i = 0; i < ediciones.length; i++) {
            if(ediciones[i]!=edicion){
               guardaredicion=Arrays.copyOf(guardaredicion,guardaredicion.length+1);
               guardaredicion[guardaredicion.length-1]= ediciones[i];
            }
        }
        ediciones=guardaredicion;
    }

    @Override
    public String toString() {
        String mensaje="";
        for (int i = 0; i < ediciones.length; i++) {
            mensaje += ediciones[i] + "\n";
        }
        return "Atrios " +
                "Ediciones= " + "\n"+ mensaje;
    }
}
