import java.util.Scanner;

public class Tarea3ejercicio2 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        short n1;
        short n2;

        System.out.println("Introduce el año de tu nacimiento");
        n1 = sc.nextShort();

        System.out.println("Introduce el año actual");
        n2 = sc.nextShort();

        System.out.println("Tu edad es de: ");

        System.out.println(n2-n1);
    }
}
