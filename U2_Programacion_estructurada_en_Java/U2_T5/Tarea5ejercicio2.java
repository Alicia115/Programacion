import java.util.Scanner;

public class Tarea5ejercicio2 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n1;

        System.out.println("Introduce un número 12");
        n1 = sc.nextInt();

        if (n1==12){
            System.out.println("El numero es correcto");
        } else {
            System.out.println("Ese no es el numero 12");
        }
    }
}
