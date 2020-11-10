import java.util.Scanner;

public class Tarea8Bejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, i,j, base;



        System.out.println("Dame la altura de la L");
        num= sc.nextInt();

        while (num<5){

            System.out.println("El numero tiene que ser mayor a 5");
            num= sc.nextInt();
        }

        base= (int)Math.floor(num/2)+1;

        for (i=1; i<num; i++){
            System.out.println("*");

        }

        for (j=1; j<=base; j++){
            System.out.print("*");
        }

    }
}
