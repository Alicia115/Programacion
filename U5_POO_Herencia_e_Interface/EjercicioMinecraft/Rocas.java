package EjercicioMinecraft;

import cubo.Material;

public class Rocas extends Materiales implements Mezclar {

    private int dureza;

    public Rocas(String nombre, int masa, int capacidad_quemar, int capacidad_diluir, int dureza) {
        super(nombre, masa, capacidad_quemar, capacidad_diluir);
        this.dureza = dureza;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }


    @Override
    public Materiales MezclarConMaterial(Materiales material) {

        if(material instanceof Mezclar){

            String nombre= this.getClass().getSimpleName()+ " de " +material.getNombre();
            int masa = this.getMasa()+ material.getMasa();
            int capacidad_quemar = this.getCapacidad_quemar()+ material.getCapacidad_quemar();
            int capacidad_diluir = this.getCapacidad_diluir()+material.getCapacidad_diluir();
            Rocas nuevaRoca = new Rocas(nombre,masa,capacidad_quemar,capacidad_diluir,45);
            System.out.println("Nuevo Material : " + nuevaRoca.getNombre());
            return nuevaRoca;

        } else{

            String nombre= material.getClass().getSimpleName()+" de "+this.getNombre();
            int masa = this.getMasa()+material.getMasa();
            int capacidad_quemar = this.getCapacidad_quemar()+ material.getCapacidad_quemar();
            int capacidad_diluir = this.getCapacidad_diluir()+ material.getCapacidad_diluir();
            if(material instanceof Sierra){
                Sierra mat = (Sierra)material;
                Herramienta nuevoMat = new Sierra(nombre, masa, capacidad_quemar, capacidad_diluir, 56);
                System.out.println("Nuevo Material : "+nuevoMat.getNombre());
                return nuevoMat;

            } else{
                Pico mat= (Pico) material;
                System.out.println();
                Pico nuevoMat = new Pico(nombre,masa,capacidad_quemar,capacidad_diluir, 34);
                System.out.println("Nuevo Material : "+nuevoMat.getNombre());
                return nuevoMat;
            }
        }
    }

    @Override
    public String toString() {
        return "Roca " +
                "dureza=" + dureza +
                super.toString();
    }
}
