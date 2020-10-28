import java.util.Scanner;

public class BucleFor6 {

    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        byte an, alt, i, j;

        System.out.println("Escribe el alto del rectangulo");
        alt = sc.nextByte();

        System.out.println("Escribe el ancho del rectangulo");
        an = sc.nextByte();

        for ( i=1 ; i<=alt ; i++) {

            for (j=1 ; j<=an ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

}
