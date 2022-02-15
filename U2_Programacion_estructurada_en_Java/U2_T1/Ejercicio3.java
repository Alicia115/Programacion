import java.util.Scanner;

public class Ejercicio3 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n1,n2,n3,num, n;


        System.out.println("Introduce tus numeros favoritos del 0 al 9");

        n1= sc.nextInt();
        while ((n1<0) || (n1>9)){
            System.out.println("Numero entre 0 y 9");
            n1= sc.nextInt();
        }

        n2= sc.nextInt();
        while ((n2<0) || (n2>9)){
            System.out.println("Numero entre 0 y 9");
            n2= sc.nextInt();
        }

        n3= sc.nextInt();
        while ((n3<0) || (n3>9)){
            System.out.println("Numero entre 0 y 9");
            n3= sc.nextInt();
        }

        System.out.println("Introduce el numero de la loteria");
        num= sc.nextInt();
        while ((num<0) || (num>99999)){
            System.out.println("Numero entre 00000 y 99999");
            num= sc.nextInt();
        }


        while (num>0) {
            n = num-(int)Math.floor(num/10)*10;
            num = (int)Math.floor(num/10);

        }

    }
}
