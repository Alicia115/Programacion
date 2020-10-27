import java.util.Scanner;

public class Tarea6ejercicio3OperadorCondicional {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num;




        System.out.println("Escribe un numero");
        num = sc.nextInt();

        System.out.println((num%2== 0) ? 1: 0);
    }
}
