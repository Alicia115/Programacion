package EjercicioMinecraft;

import java.util.Arrays;

public class Minecraft {

    Materiales[] grupoMateriales;
    int maxmaterial;

    public Minecraft() {
        grupoMateriales = new Materiales[0];
        this.maxmaterial=10;
    }

    public void addMaterial(Materiales material){

        if(grupoMateriales.length<maxmaterial){

            grupoMateriales = Arrays.copyOf(grupoMateriales, grupoMateriales.length+1);
            grupoMateriales[grupoMateriales.length-1]= material;
        }
    }

    public void borrarMaterialSinMasa(){

        Materiales[] guardarMateriales= new Materiales[0];

        for (int i = 0; i < grupoMateriales.length; i++) {
            if(grupoMateriales[i].masa>0){
               guardarMateriales= Arrays.copyOf(guardarMateriales,guardarMateriales.length+1);
               guardarMateriales[guardarMateriales.length-1]=grupoMateriales[i];
            }
        }
        grupoMateriales=guardarMateriales;
    }

    public void mostrarEstado(){
        System.out.println(this);
    }


    public void ultimoMaterialQueQueda(){

        if(grupoMateriales.length==1){
            System.out.println(Arrays.toString(grupoMateriales));
        }
    }

    @Override
    public String toString() {
            String mensaje="";
        for (int i = 0; i < grupoMateriales.length; i++) {
            mensaje+= grupoMateriales[i]+"\n";
        }

        return "Minecraft " +
                " Grupo Materiales=" + "\n" +mensaje;
    }
}
