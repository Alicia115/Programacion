import java.util.Scanner;

public class BucleFor9 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        long num,i, contador;
        contador=0;

        System.out.println("Escribe un numero");
        num = sc.nextLong();

        for ( i=1 ; i<=num ; i++) {
            if (num%i==0){
                contador++;
            }
        }
        if (contador<=2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
