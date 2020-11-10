import java.util.Scanner;

public class Tarea8Bejercicio7 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num, i, n;
        n=0;

        System.out.println("Introduce un numero largo, te daremos su inverso");
        num= sc.nextInt();

        for (i=0; i<=num; i++){
            n=num%10;
            num = (int)Math.floor(num/10);
            System.out.print(n);
        }
    }
}
