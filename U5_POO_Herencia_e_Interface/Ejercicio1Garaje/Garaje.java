package Ejercicio1Garaje;

import java.util.Arrays;

public class Garaje {

    Vehiculo[] guardar;

    public Garaje() {
        this.guardar = new Vehiculo[0];
    }

    public Vehiculo[] getGuardar() {
        return guardar;
    }

    public void setGuardar(Vehiculo[] guardar) {
        this.guardar = guardar;
    }

    public void addVehiculo(Vehiculo vehiculo){
        guardar= Arrays.copyOf(guardar,guardar.length+1);
        guardar[guardar.length-1]=vehiculo;
    }

    public void restarVehiculo(String nombre ){

        Vehiculo[] auxiliar = new Vehiculo[0];

        for (int i = 0; i < guardar.length; i++) {

            if(!guardar[i].nombre.equalsIgnoreCase(nombre)){
                auxiliar= Arrays.copyOf(auxiliar,auxiliar.length+1);
                auxiliar[auxiliar.length-1]=guardar[i];
            }
        }
        guardar=auxiliar;
    }


}
