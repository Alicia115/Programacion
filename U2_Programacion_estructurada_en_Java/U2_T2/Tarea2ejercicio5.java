import java.util.Scanner;

public class Tarea2ejercicio5 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int C;
        System.out.println("Dame una temperatura en grados centigrados");
        C = sc.nextInt();

        System.out.println("La temperatura introducida en grados Fahrenheit equivalen a: ");
        System.out.println(9*C/5 + 32);    }
}
