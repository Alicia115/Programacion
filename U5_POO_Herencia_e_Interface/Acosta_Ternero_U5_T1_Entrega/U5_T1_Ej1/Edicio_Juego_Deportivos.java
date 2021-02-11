package U5_T1_Ej1;

import java.util.Arrays;
import java.util.Comparator;

public class Edicio_Juego_Deportivos {

    private int anio;
    private String sede;
    private Pais[] paises;
    private Deporte[] deportes;

    public Edicio_Juego_Deportivos(int anio, String sede) {

        if(anio%4==0){
            this.anio = anio;
        } else{
            this.anio= 2004;
        }
        this.sede = sede;
        this.paises= new Pais[0];
        this.deportes= new Deporte[0];
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Pais[] getPaises() {
        return paises;
    }

    public void setPaises(Pais[] paises) {
        this.paises = paises;
    }

    public Deporte[] getDeportes() {
        return deportes;
    }

    public void setDeportes(Deporte[] deportes) {
        this.deportes = deportes;
    }

    public void addpaises (Pais pais){
        paises= Arrays.copyOf(paises, paises.length+1);
        paises[paises.length-1]= pais;
    }

    public void quitarpais (Pais pais){
        Pais[] guardarpaises=new Pais[0];
        for (int i = 0; i < paises.length; i++) {
            if(paises[i]!=pais){
                guardarpaises=Arrays.copyOf(guardarpaises,guardarpaises.length+1);
                guardarpaises[guardarpaises.length-1]= paises[i];
            }
        }
        paises=guardarpaises;
    }

    public void adddeportes (Deporte deporte){
        deportes= Arrays.copyOf(deportes, deportes.length+1);
        deportes[deportes.length-1]= deporte;
    }

    public void quitardeportes (Deporte deporte){
        Deporte[] guardardeportes = new Deporte[0];
        for (int i = 0; i < deportes.length; i++) {
            if(deportes[i]!=deporte){
                guardardeportes=Arrays.copyOf(guardardeportes,guardardeportes.length+1);
                guardardeportes[guardardeportes.length-1]= deportes[i];
            }
        }
        deportes=guardardeportes;
    }

    public void mostrarPaisesParaCeremonia(){
        Arrays.sort(paises);
        System.out.println(paises);
    }

    public void mostrarPaises(){
        Arrays.sort(paises,new Pais.comparar_num_participantes());
        System.out.println(paises);
    }

    @Override
    public String toString() {
        String paisesmensaje="";
        String deportesmensaje="";
        for (int i = 0; i < paises.length; i++) {
            paisesmensaje +=paises[i] + "\n";
        }
        for (int i = 0; i < deportes.length; i++) {
            deportesmensaje +=deportes[i] + "\n";
        }
        return  super.toString()+"\n"+
                "  Año= " + anio + "\n"+
                "  Sede= " + sede +"\n"+
                "  Paises= " + "\n" +paisesmensaje+
                "  Deportes= " + "\n" +deportesmensaje ;
    }
}
