import java.util.Scanner;

public class Tarea8Bejercicio2 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num, i;

        System.out.println("Introduce un numero");
        num= sc.nextInt();

        for(i=num; i<=num+4; i++){

                System.out.println(i+ "  " +(i*i)+ "  " + (i*i*i));


        }

    }
}
