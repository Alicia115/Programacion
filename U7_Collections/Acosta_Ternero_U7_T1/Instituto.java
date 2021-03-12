import java.io.*;
import java.util.*;

public class Instituto implements Serializable {

    private String nombre;
    private Map<String, List<Alumnos>> lista_alumnos;

    public Instituto(String nombre) {
        this.nombre = nombre;
        lista_alumnos= new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<String, List<Alumnos>> getLista_alumnos() {
        return lista_alumnos;
    }

    public void setLista_alumnos(Map<String, List<Alumnos>> lista_alumnos) {
        this.lista_alumnos = lista_alumnos;
    }

    public void addAlumnoUnidad(String unidad, Alumnos alumno){

        if(alumno.getUnidad().equals(unidad)){
            if(!lista_alumnos.containsKey(unidad)){
                lista_alumnos.put(unidad, new LinkedList<Alumnos>());
            }
            lista_alumnos.get(unidad).add(alumno);
        }
    }

    public String obtenerUnidadAlumno(int id){
        Collection<List<Alumnos>> conjunto = lista_alumnos.values();

        Iterator it = conjunto.iterator();
        while(it.hasNext()){
            List<Alumnos> alumn = (List<Alumnos>) it.next();

            for (Alumnos al:alumn) {
                if(al.getId()==id){
                    return al.getUnidad() ;
                }
            }
        }
        return "No existe ese alumno en la lista de alumnos";
    }

    public void  mostrarAlumnosUnidad(String unidad){

        if(lista_alumnos.containsKey(unidad)){

            List<Alumnos> lista = lista_alumnos.get(unidad);
            lista.sort(new Comparator<Alumnos>() {
                @Override
                public int compare(Alumnos o1, Alumnos o2) {
                    return o1.getDni().compareTo(o2.getDni());
                }
            });
            System.out.println(lista);
        }
    }

    public void guardarAlumnos(){

        try {
            ObjectOutputStream x = new ObjectOutputStream(new FileOutputStream("src/alumnos.dat"));

            Collection<List<Alumnos>> conjunto = lista_alumnos.values();

            Iterator it = conjunto.iterator();
            while(it.hasNext()){
                List<Alumnos> alumn = (List<Alumnos>) it.next();

                for (Alumnos al:alumn) {
                    x.writeObject(al);
                }
            }

            x.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void cargarAlumnos(){

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/alumnos.dat"));

            while (true) {
                Alumnos alumno = (Alumnos) in.readObject();
                addAlumnoUnidad(alumno.getUnidad(), alumno);
            }
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
