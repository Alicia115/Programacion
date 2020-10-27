import java.util.Scanner;

public class BucleDoWhile6 {
    public static void main( String args[] ){

        byte n1,i,j;

        Scanner sc = new Scanner(System.in);

        i=0;

        System.out.println("Escribe el tamaño de tu cuadrado");
        n1 = sc.nextByte();

        do {
            j=0;
            do {
                System.out.print("* ");

                j++;
            }while (j<n1);
            System.out.println("");
            i++;

        }
        while (i<n1);
    }
}
