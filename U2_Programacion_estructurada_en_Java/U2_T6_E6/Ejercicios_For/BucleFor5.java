import java.util.Scanner;

public class BucleFor5 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num,i;

        System.out.println("Escribe un numero");
        num = sc.nextInt();

        for ( i=0 ; i<=num ; i++) {
            if ((i%3 == 0) & (i%7 == 0)){
                System.out.println(i);
            }

        }
    }
}
