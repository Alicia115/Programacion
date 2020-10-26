import java.util.Scanner;

public class Tarea5ejercicio1 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n1;


        System.out.println("Introduce un número");
        n1 = sc.nextInt();

        if (n1>0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }


    }
}
