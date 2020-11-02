import java.util.Scanner;

public class Tarea8ejercicio12 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int nota,i, suspenso;
        suspenso=0;
        nota=0;


        for (i=1; i<=5; i++){

            System.out.println("Escribe 6 notas de 6 alumnos");
            nota= sc.nextInt();

            while (nota<0){
                System.out.println("La nota tiene que ser positiva");
            }
            if (nota<5){
                suspenso++;
            }
        }
        if (suspenso>=1){
            System.out.println("De las notas introducidas hay algún suspenso");
        } else {
            System.out.println("No hay ningun suspenso");
        }

    }
}
