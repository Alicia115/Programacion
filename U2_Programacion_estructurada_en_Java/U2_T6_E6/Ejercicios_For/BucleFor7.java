import java.util.Scanner;

public class BucleFor7 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        byte alt, i, j;

        System.out.println("Escribe el alto del rectangulo");
        alt = sc.nextByte();

        for ( i=1 ; i<=alt ; i++) {

            for (j=1 ; j<=alt ; j++) {
                if ((i==1) || (i==alt) || (j==1) || (j==alt)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}
