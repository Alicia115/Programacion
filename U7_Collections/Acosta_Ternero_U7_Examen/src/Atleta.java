import java.io.Serializable;

public class Atleta implements Serializable {

    private int dorsal;
    private String nombre;
    private String pais;
    private int segundos;
    private String categoria;
    private boolean finisher;

    public Atleta(int dorsal, String nombre, String pais, int segundos, String categoria) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.pais = pais;
        this.segundos = segundos;
        this.categoria = categoria;
        this.finisher = finisher;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Atleta " + "\n"+
                "  dorsal: " + dorsal +"\n"+
                "  nombre: " + nombre + "\n"+
                "  pais: " + pais + "\n"+
                "  segundos: " + segundos +"\n"+
                "  finisher: " + finisher +"\n"+
                "  categoria: " + categoria +"\n";
    }
}
