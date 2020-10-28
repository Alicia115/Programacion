import java.util.Scanner;

public class BucleFor8 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        long num,i;

        System.out.println("Escribe un numero");
        num = sc.nextLong();

        for ( i=1 ; i<=num ; i++) {
            if (num%i == 0){
                System.out.println(i);
            }

        }
    }
}
