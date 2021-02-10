package EjercicioMinecraft;

import cubo.Material;

public class Metal extends Materiales implements Mezclar{

    private boolean imantable;

    public Metal(String nombre, int masa, int capacidad_quemar, int capacidad_diluir, boolean imantable) {
        super(nombre, masa, capacidad_quemar, capacidad_diluir);
        this.imantable = false;
    }

    public boolean isImantable() {
        return imantable;
    }

    public void setImantable(boolean imantable) {
        this.imantable = imantable;
    }

    @Override
    public Materiales MezclarConMaterial(Materiales material) {
        if(material instanceof Mezclar){

            String nombre= this.getClass().getSimpleName()+ " de " +material.getNombre();
            int masa = this.getMasa()+ material.getMasa();
            int capacidad_quemar = this.getCapacidad_quemar()+ material.getCapacidad_quemar();
            int capacidad_diluir = this.getCapacidad_diluir()+material.getCapacidad_diluir();
            Metal nuevoMetal = new Metal(nombre,masa,capacidad_quemar,capacidad_diluir, true);
            System.out.println("Nuevo Material : " + nuevoMetal.getNombre());
            return nuevoMetal;

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
        return "Metal " +
                " imantable=" + imantable +
                super.toString();
    }
}
