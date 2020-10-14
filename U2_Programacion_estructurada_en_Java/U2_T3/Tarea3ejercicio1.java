import java.util.Scanner;

public class Tarea3ejercicio1 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        byte n1, n2;

        System.out.println("Dame un numero");
        n1 = sc.nextByte();
        System.out.println("Dame otro numero");
        n2 = sc.nextByte();

        System.out.println("El resultado de la suma es: " +(n1+n2));

    }
}
