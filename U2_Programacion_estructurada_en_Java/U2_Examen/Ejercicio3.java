import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int altura;

        System.out.println("Dime la altura del reloj de arena, tiene que ser impar y mayor a 3");
        altura = sc.nextInt();

        while ((altura<3) || (altura%2==0)){
            System.out.println("Error, la altura debe ser mayor o igual a 3 y numero impar");
            altura = sc.nextInt();
        }

        for (int i = 0; i < altura ; i++) {

            for (int j = 0; j < altura; j++) {

                if (i==0){
                    System.out.print("*");
                }

            }
            System.out.println(" ");

        }


    }
}
