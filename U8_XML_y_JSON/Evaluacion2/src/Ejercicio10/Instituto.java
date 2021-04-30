package Ejercicio10;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Instituto {

    private Set<Departamento> departamentos;
    protected String nombre;
    protected int codigo;

    public Instituto(String nombre, int codigo, String nombre_fichero) {
        this.nombre = nombre;
        this.codigo = codigo;
        departamentos = new LinkedHashSet<>();
        cargarInstituto(nombre_fichero);
    }

    public Set<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Set<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "departamentos=" + departamentos +
                ", nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                '}';
    }

    public void cargarInstituto (String nombre_fichero){

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombre_fichero));

            while(true){
                Profesor p = (Profesor) ois.readObject();

                Departamento d = new Departamento(p.id_departamento);

                if(departamentos.contains(d)){

                    for (Departamento dept :departamentos) {
                        if(dept.id == p.id_departamento){
                            dept.addProfesor(p);
                        }
                    }
                } else{
                    d.addProfesor(p);
                    departamentos.add(d);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    boolean contieneDep (Departamento d){

        if(departamentos.contains(d)){
            return true;
        } else{
            System.out.println("El instituto no contiene ese departamento");
            return false;
        }
    }

    Departamento getDepartamento (Departamento d){
        if(departamentos.contains(d)){
            for (Departamento dep : departamentos) {

                if(dep.id == d.id){
                    return dep;
                }
            }
        }
       return null;
    }

    boolean addDepartamento (Departamento d){

        return departamentos.add(d);
    }


    public void guardar (String nom_fichero){

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(nom_fichero));

            for (Departamento d: departamentos) {
                for (Profesor p: d.profesores) {
                    os.writeObject(p);
                }
            }
            os.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
