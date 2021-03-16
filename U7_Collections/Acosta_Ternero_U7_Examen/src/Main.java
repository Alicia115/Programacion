import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Maraton maraton = new Maraton();
        maraton.cargarAtletas();

        Atleta atleta1 = new Atleta(1,"Alicia", "España", 23, "SENIOR");
        Atleta atleta2 = new Atleta(2,"Gonzalo", "España", 33, "SENIOR");
        Atleta atleta3 = new Atleta(3,"Angela", "Rusia", 56, "SENIOR");
        Atleta atleta4 = new Atleta(4,"Pedro", "España", 29, "SENIOR");
        Atleta atleta5 = new Atleta(5,"Oscar", "España", 63, "SENIOR");
        Atleta atleta6 = new Atleta(6,"David", "Rusia", 53, "VETERANO");
        Atleta atleta7 = new Atleta(7,"Andrea", "Rusia", 83, "VETERANO");
        Atleta atleta8 = new Atleta(8,"Silvia", "Rusia", 28, "VETERANO");
        Atleta atleta9 = new Atleta(9,"Marilo", "España", 93, "VETERANO");
        Atleta atleta10 = new Atleta(10,"Daniel", "España", 64, "VETERANO");
        Atleta atleta11 = new Atleta(11,"Juan", "Portugal", 23, "JUNIOR");
        Atleta atleta12 = new Atleta(12,"Diego", "Portugal", 58, "JUNIOR");
        Atleta atleta13 = new Atleta(13,"Pablo", "Portugal", 24, "JUNIOR");
        Atleta atleta14 = new Atleta(14,"Guille", "Portugal", 12, "JUNIOR");
        Atleta atleta15 = new Atleta(15,"Raul", "Portugal", 11, "JUNIOR");

        maraton.guardarAtletas();

        String opcion, pais;

        do{
            System.out.println("Escoge una opcion");
            mostrarMenu();
            opcion = sc.nextLine();

            switch (opcion){

                case "1":
                    maraton.cargarAtletas();
                    break;

                case "2":
                    maraton.guardarAtletas();
                    break;

                case "3":
                    maraton.inscribirAtleta();
                    System.out.println(maraton);
                    break;

                case "4":

                    break;

                case "5":
                    maraton.borrarAtleta();
                    System.out.println(maraton);
                    break;

                case "6":
                    maraton.mostrarListaFishers();
                    break;

                case "7":
                    maraton.mostrarListaCategoria();
                    break;

                case "8":
                    System.out.println("Dime el pais de donde quieras saber los inscritos");
                    pais=sc.nextLine();
                    maraton.ParticipantesPorPaís(pais);
                    break;
            }

        }while(!opcion.equals("9"));

    }


    public static void mostrarMenu(){
        System.out.println("1. Cargar Atleta");
        System.out.println("2. Guardar Atleta");
        System.out.println("3. Inscribir Atleta");
        System.out.println("4. Guardar Tiempo");
        System.out.println("5. Borrar Atleta");
        System.out.println("6. Mostrar Lista por Finisher");
        System.out.println("7. Mostrar Lista por Categoria");
        System.out.println("8. Numero Participantes por Pais");
        System.out.println("9. Salir");
    }

}
