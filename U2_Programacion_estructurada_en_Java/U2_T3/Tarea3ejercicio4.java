import java.util.Scanner;

public class Tarea3ejercicio4 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        float n1;

        System.out.println("Dame una longitud en millas y la transformaremos en metros");
        n1 = sc.nextFloat();

        System.out.println("El resultado en metros de la longitud intrducida es de: " +(n1*1609));

    }
}
