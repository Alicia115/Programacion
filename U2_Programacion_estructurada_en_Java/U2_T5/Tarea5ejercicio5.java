import java.util.Scanner;

public class Tarea5ejercicio5 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        long n1, n2, n3;

        System.out.println("Introduce un número");
        n1 = sc.nextLong();

        System.out.println("Introduce otro número");
        n2 = sc.nextLong();

        System.out.println("Introduce otro número");
        n3 = sc.nextLong();


        if ((n1>=n2) & (n1>=n3)){

            System.out.println("El numero mayor es " +n1);

        } if ((n2>=n3) & (n2>=n1)){
            System.out.println("El numero mayor es " +n2);
        } if ((n3>=n2) & (n3>=n1)){
            System.out.println("El numero mayor es " +n3);
        }



    }
}
