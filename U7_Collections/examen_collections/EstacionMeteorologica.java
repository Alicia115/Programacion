package Examemenes.examen_collections;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EstacionMeteorologica {
    List<Medicion> medicions;
    Coordenadas coordenada;

    public EstacionMeteorologica(String nombre_fichero, Coordenadas coordenada) {
        this.medicions = new LinkedList<>();
        ObjectInputStream in= null;
            try {
               in = new ObjectInputStream( new FileInputStream(nombre_fichero));
                while(true){
                    Medicion aux = (Medicion) in.readObject();
                    if(aux!=null){
                        addMedicion(aux);
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }finally {
                try {
                    if(in!=null){
                        in.close();
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
               }
            }
        this.coordenada = coordenada;
    }

    public List<Medicion> getMedicions() {
        return medicions;
    }

    public void setMedicions(List<Medicion> medicions) {
        this.medicions = medicions;
    }

    public Coordenadas getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(Coordenadas coordenada) {
        this.coordenada = coordenada;
    }

    public void addMedicion (Medicion medicion){
        medicions.add(medicion);
    }

    public void ordenaTemperaturasAsc (){
        Collections.sort(medicions);
    }

    public void ordenaHumedadesDesc (){
        medicions.sort(new Medicion.ordenarDesc());
    }

    public Medicion presionMaxima (){
        Medicion max= medicions.get(0);
        for (int i = 1; i < medicions.size(); i++) {

            if(medicions.get(i).getPresion()>max.getPresion()){
                max = medicions.get(i);
            }
        }
        return max;
    }

    public boolean buscaMedicion (Medicion medicion){

        return medicions.contains(medicion);
    }

    public void guardarFichero (String nombre){

        try {
            ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream(nombre));
            for (int i = 0; i < medicions.size(); i++) {
                in.writeObject(medicions.get(i));
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "EstacionMeteorologica " +
                "  medicions: " + medicions +
                "  coordenada: " + coordenada ;
    }
}
