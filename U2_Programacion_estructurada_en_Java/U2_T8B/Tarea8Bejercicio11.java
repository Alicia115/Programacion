import java.util.Scanner;

public class Tarea8Bejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura,i, j;

        System.out.println("Dame la altura de la X");
        altura= sc.nextInt();

        while ((altura<3) || (altura%2==0)){

            System.out.println("El numero tiene que ser mayor a 3 e impar");
            altura= sc.nextInt();
        }

        for (i=1; i<=altura; i++){
            for (j=1; j<=altura; j++){
                if ((i==j) || (i+j==altura+1)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
