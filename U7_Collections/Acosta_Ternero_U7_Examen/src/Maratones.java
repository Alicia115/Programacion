/*
import javax.accessibility.AccessibleText;
import java.io.*;
import java.util.*;

public class Maratones implements Serializable {

    Map<Integer, Set<Atleta>> participantes = new HashMap<>();

    public Maratones() {
        this.participantes = participantes;
    }

    public Map<Integer, Set<Atleta>> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Map<Integer, Set<Atleta>> participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return "Maraton " +"\n"+
                "  Participantes: " + participantes + "\n"
               ;
    }

    public void inscribirAtleta (Atleta atleta){

        if(!participantes.containsKey(atleta.getDorsal())){
            participantes.put(atleta.getDorsal(),participantes.get(atleta));
        }else{
            if(participantes.get(atleta.getDorsal()).equals(atleta.getDorsal())){
                participantes.get(atleta.getDorsal()).add(atleta);
            }
        }
    }

    public void borrarAtleta (int dorsal){

        if(!participantes.containsKey(dorsal)){
            System.out.println("No existe atleta con ese dorsal");
        } else{
            if(participantes.get(dorsal).equals(dorsal))
                participantes.remove(dorsal,participantes.get(dorsal));
        }
    }

    public void mostrarListaFishers(){

        List<Atleta> lista = new LinkedList<>();

        Collections.sort(lista, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta o1, Atleta o2) {
                return o1.getSegundos()-o2.getSegundos();
            }
        });

    }

    public void crearAtleta (){
        Scanner sc = new Scanner(System.in);
        int dorsal, segundos;
        String nombre,pais, categoria;
        System.out.println("Dame los datos del participante");
        System.out.println("Dorsal: ");
        dorsal= sc.nextInt();
        System.out.println("Nombre: ");
        nombre= sc.nextLine();
        System.out.println("pais: ");
        pais= sc.nextLine();
        System.out.println("segundos: ");
        segundos=sc.nextInt();
        System.out.println("Categoria (SENIOR, JUNIOR, VETERANO): ");
        categoria = sc.nextLine();
        Atleta atleta = new Atleta(dorsal,nombre,pais,segundos,Categoria.categoria);
        System.out.println(atleta);

    }


    public void cargarAtletas(){

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("maraton.dat"));

            while(true){
                Set<Atleta> atletas= (Set<Atleta>) in.readObject();
                inscribirAtleta((Atleta) atletas);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void guardarAtletas(){

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("maraton.dat"));

            Collection<Set<Atleta>> conjunto = participantes.values();

            Iterator it = conjunto.iterator();

            while(it.hasNext()){
                Set<Atleta> lista = (Set<Atleta>) it.next();
                for (Atleta a: lista) {
                    os.writeObject(a);
                }
            }
            os.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
*/
