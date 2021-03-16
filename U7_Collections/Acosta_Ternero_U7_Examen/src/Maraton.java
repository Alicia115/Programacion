import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Maraton {

    Set<Atleta> participantes = new LinkedHashSet<>();

    public Maraton() {
        this.participantes = participantes;
    }

    public Set<Atleta> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Atleta> participantes) {
        this.participantes = participantes;
    }

    @Override
    public String toString() {
        return "Maraton " +"\n"+
                "  Participantes: " + participantes + "\n"
                ;
    }

    public void inscribirAtleta (){

        Scanner sc = new Scanner(System.in);
        int dorsal, segundos;
        String nombre,pais, categoria, opcion;
        do{
            System.out.println("Dame los datos del participante");
            System.out.println("Dorsal: ");
            dorsal= sc.nextInt();
            System.out.println("Nombre: ");
            nombre= sc.nextLine();
            nombre= sc.nextLine();
            System.out.println("pais: ");
            pais= sc.nextLine();
            System.out.println("segundos: ");
            segundos=sc.nextInt();
            System.out.println("Categoria (SENIOR, JUNIOR, VETERANO): ");
            categoria = sc.nextLine();
            categoria = sc.nextLine();
            Atleta atleta = new Atleta(dorsal,nombre,pais,segundos,categoria);
            if(!participantes.contains(atleta)){
                participantes.add(atleta);
                cargarAtletas();
                guardarAtletas();
            } else {
                System.out.println("Ya está inscrito ese participante");
            }
            System.out.println("¿Quieres seguir añadiendo participantes? S/N");
            opcion=sc.nextLine();

        }while(opcion.equals("S"));

    }

    public void borrarAtleta (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el dorsal que quieras borrar");
        int dorsal= sc.nextInt();

        for (int i = 0; i < participantes.size(); i++) {

            if(participantes.contains(dorsal)){
                participantes.remove(i);
            }else{
                System.out.println("No existe un atleta con ese dorsal");
            }
        }
    }

    public void mostrarListaFishers(){
        List<Atleta> lista = new ArrayList<>();
        Collections.sort(lista, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta o1, Atleta o2) {
                return o1.getSegundos()-o2.getSegundos();
            }
        });
    }

    public void mostrarListaCategoria(){

        List<Atleta> lista = new ArrayList<>();
        Collections.sort(lista, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta o1, Atleta o2) {
                return o1.getCategoria().compareTo(o2.getCategoria());
            }
        });
    }

    public void ParticipantesPorPaís(String pais){
        int contador=0;

        for (int i = 0; i < participantes.size(); i++) {
            if(participantes.contains(pais)){
                contador++;
            }
        }

        System.out.println("El pais "+ pais+ " contiene "+ contador);
    }

   /* public void crearAtleta (){
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
        Atleta atleta = new Atleta(dorsal,nombre,pais,segundos,categoria);
        System.out.println(atleta);
    }*/


    public void cargarAtletas(){

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/maraton.dat"));

            while(true){
                Set<Atleta> atletas= (Set<Atleta>) in.readObject();
                participantes.add((Atleta) atletas);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void guardarAtletas(){

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/maraton.dat"));

            for (int i = 0; i < participantes.size(); i++) {

                os.writeObject(i);
            }
            os.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
