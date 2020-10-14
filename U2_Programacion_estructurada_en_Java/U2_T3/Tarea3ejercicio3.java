import java.util.Scanner;

public class Tarea3ejercicio3 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;

        System.out.println("Introduce un numero");
        n1 = sc.nextDouble();

        System.out.println("Introduce otro numero");
        n2 = sc.nextDouble();

        System.out.println("Su division es de: " +(n1/n2));
;
    }
}
