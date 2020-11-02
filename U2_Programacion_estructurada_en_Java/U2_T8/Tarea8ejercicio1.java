import java.util.Scanner;

public class Tarea8ejercicio1 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num,i;

        System.out.println("Dime un numero");
        num= sc.nextInt();

        while (num!=0){

            if (num%2==0){
                System.out.println("El numero es par");
            }

            if (num>0){
                System.out.println("El numero es positivo");
            }

            System.out.println("Su cuadrado es " +num*num);

            System.out.println("Dime un numero");
            num= sc.nextInt();
        }
        System.out.println("Se acabó");
    }
}
