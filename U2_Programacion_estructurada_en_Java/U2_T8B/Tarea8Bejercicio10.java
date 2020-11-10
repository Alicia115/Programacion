import java.util.Scanner;

public class Tarea8Bejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,i, j;

        System.out.println("Dame la altura de la U");
        num= sc.nextInt();

        while (num<5){

            System.out.println("El numero tiene que ser mayor a 5");
            num= sc.nextInt();
        }

        for (i=1; i<=num; i++){

            System.out.println("*     *");
        }

        System.out.print(" ***** ");

    }
}
