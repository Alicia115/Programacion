package Ejercicio_Examen_Magia;

public abstract class Personaje {

    protected String nombre;
    protected int energia;
    protected int ataque;
    protected int defensa;
    protected boolean encantado;

    Personaje[] crear;

    public Personaje(String nombre, int energia, int ataque, int defensa) {
        this.nombre = nombre;
        if(energia>0 && energia<1000){
            this.energia = energia;
        } else{
            this.energia=(int) (Math.random()*(1000-1)+1);
        }
        if(ataque>0 && ataque<100){
            this.ataque = ataque;
        } else{
            this.ataque=(int) (Math.random()*(100-1)+1);
        }
        if(defensa>0 && defensa<100){
            this.defensa = defensa;
        } else{
            this.defensa=(int) (Math.random()*(100-1)+1);
        }
        this.encantado = false;
        this.crear= new Personaje[0];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isEncantado() {
        return encantado;
    }

    public void setEncantado(boolean encantado) {
        this.encantado = encantado;
    }

    public Personaje[] getCrear() {
        return crear;
    }

    public void setCrear(Personaje[] crear) {
        this.crear = crear;
    }
    

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", encantado=" + encantado +
                '}';
    }
}
