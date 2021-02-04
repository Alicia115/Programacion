package Ejercicio1Garaje;

public abstract class Vehiculo {

    protected String nombre;
    protected int personas;

    public Vehiculo(String nombre) {
        this.nombre = nombre;
        this.personas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {

        if(personas>0){
            this.personas = personas;
        } else{
            System.out.println("Asi no se puede");
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                ", personas=" + personas +
                '}';
    }

    public void transportar(int personitas){

        if(personas<0){
            System.out.println("No se puede transportar 0 personitas");
        } else{
            this.personas+=personitas;
        }
    }



}
