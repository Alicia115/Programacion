import java.util.Scanner;

public class Ejercicio1 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int alt,i;


        System.out.println("Dame la altura de tus calcetines, tiene que ser mayor de 4");
        alt= sc.nextInt();

        while (alt<4){
            System.out.println("Dame la altura de tus calcetines, tiene que ser mayor de 4");
            alt= sc.nextInt();
        }

        for ( i=1 ; i<=alt ; i++) {


            if (i>=alt-1){
                System.out.print("******  ******");
            }else{
                System.out.print("***     ***");
            }


            System.out.println("");
        }
    }
}
