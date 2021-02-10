package EjercicioMinecraft;

import cubo.Material;

public class Cristal extends Materiales implements Mezclar {

    private CristalTipo cristal;

    public Cristal(String nombre, int masa, int capacidad_quemar, int capacidad_diluir, CristalTipo cristal) {
        super(nombre, masa, capacidad_quemar, capacidad_diluir);
        this.cristal = cristal;
    }

    public CristalTipo getCristal() {
        return cristal;
    }

    public void setCristal(CristalTipo cristal) {
        this.cristal = cristal;
    }

    @Override
    public Materiales MezclarConMaterial(Materiales material) {

        if(material instanceof Mezclar){
            String nombre= this.getClass().getSimpleName()+ " de " +material.getNombre();
            int masa = this.getMasa()+ material.getMasa();
            int capacidad_quemar = this.getCapacidad_quemar()+ material.getCapacidad_quemar();
            int capacidad_diluir = this.getCapacidad_diluir()+material.getCapacidad_diluir();
            Cristal nuevoCristal = new Cristal(nombre,masa,capacidad_quemar,capacidad_diluir, CristalTipo.TRANSLUCIDO);
            System.out.println("Nuevo Material : " + nuevoCristal.getNombre());
            return nuevoCristal;
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

        return
                "Cristal  " + cristal+
                super.toString();
    }
}
