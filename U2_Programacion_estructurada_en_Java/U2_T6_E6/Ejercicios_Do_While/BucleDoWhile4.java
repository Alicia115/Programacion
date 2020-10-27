import java.util.Scanner;

public class BucleDoWhile4 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n1,n2;


        do {
            System.out.println("Escribe un numero");
            n1 = sc.nextInt();
            System.out.println("Escribe otro numero");
            n2 = sc.nextInt();
            System.out.println("La suma de ambos numeros es " +(n1+n2));

        }
        while (n1+n2!=0);
    }
}
