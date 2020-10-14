import java.util.Scanner;

public class Tarea2ejercicio3 {

    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;


        System.out.println("Introduce un número");
        n1 = sc.nextInt();

        System.out.println("Introduce otro número");
        n2 = sc.nextInt();

        System.out.println("El resultado de la división es: ");

        System.out.println(n1/n2);
    }

}
