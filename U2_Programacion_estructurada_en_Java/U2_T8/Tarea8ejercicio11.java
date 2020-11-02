import java.util.Scanner;

public class Tarea8ejercicio11 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int i,j;

        for (i=1; i<=10; i++){
            for (j=1; j<=10; j++){
                System.out.println(i+ " x " +j+ " = " +i*j);
            }

            System.out.println("");
        }

    }
}
