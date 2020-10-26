import java.util.Scanner;

public class Tarea5ejercicio6 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        double n1;

       final double grav= 9.8;

        System.out.println("Introduce el valor de tiempo y te mostramos la velocidad");
        n1 = sc.nextDouble();

        if (n1>0) {
            System.out.println("la velocidad con el tiempo escogido es de " +(n1*grav));
        } else
            System.out.println("Tiempo incorrecto");



    }
}
