import java.util.Scanner;

public class Tarea8ejercicio13 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int nota,i, suspenso, condicional, aprobado;
        suspenso=0;
        condicional=0;
        nota=0;
        aprobado=0;

        for (i=1; i<=6; i++){
            while (nota<0){
                System.out.println("No hay notas negativas, pon una positiva");
            }
            System.out.println("Escribe 6 notas");
            nota= sc.nextInt();

            if (nota==4){
                condicional++;
            }

            if (nota<4){
                suspenso++;
            }

            if (nota>=5){
                aprobado++;
            }
        }
        System.out.println("De las notas introducidas el numero de aprobados es " +aprobado);
        System.out.println("De las notas introducidas el numero de suspensos es " +suspenso);
        System.out.println("De las notas introducidas el numero de condicionales es " +condicional);
    }
}
