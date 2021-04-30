package Ejercicio10;

import java.util.ArrayList;
import java.util.Objects;

public class Departamento {

    protected ArrayList<Profesor> profesores;
    protected int id;

    public Departamento(int id) {
        this.id = id;
        profesores = new ArrayList<>();
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "profesores=" + profesores +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void addProfesor (Profesor p){
        if(p.id_departamento== id){
            profesores.add(p);
        }
    }
}
