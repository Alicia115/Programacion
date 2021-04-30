package Ejercicio10;

import java.io.Serializable;

public class Profesor implements Serializable {

    protected String nombre;
    protected String dni;
    protected String profesion;
    protected int id_departamento;

    public Profesor(String nombre, String dni, String profesion, int id_departamento) {
        this.nombre = nombre;
        this.dni = dni;
        this.profesion = profesion;
        this.id_departamento = id_departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", profesion='" + profesion + '\'' +
                ", id_departamento=" + id_departamento +
                '}';
    }
}
