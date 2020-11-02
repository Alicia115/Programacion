import java.util.Scanner;

public class Tarea8ejercicio14 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num,i,j;

        System.out.println("Di el tamaño del rectangulo");
        num= sc.nextInt();

        for (i=1; i<=num; i++){
            for (j=1; j<=(num-i)+1; j++){

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
