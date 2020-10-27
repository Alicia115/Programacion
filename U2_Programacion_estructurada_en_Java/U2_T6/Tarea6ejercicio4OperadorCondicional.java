import java.util.Scanner;

public class Tarea6ejercicio4OperadorCondicional {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        byte n1, n2;
        double menor;


        System.out.println("Escribe un numero");
        n1 = sc.nextByte();
        System.out.println("Escribe un numero");
        n2 = sc.nextByte();

        menor = (n1>n2) ? n2 : n1;

        System.out.println("El menor es " +menor);
    }
}
