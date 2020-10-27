import java.util.Scanner;

public class BucleDoWhile5 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n1,n2;


        do {
            System.out.println("Escribe su usuario");
            n1 = sc.nextInt();

        }
        while (n1!=1809);

        System.out.println("Usuario correcto.");

        do {
            System.out.println("Escribe su contraseña");
            n2 = sc.nextInt();

        }
        while (n2!=1234);
        System.out.println("¡Ha entrado!");
    }
}
