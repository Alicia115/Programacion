import java.util.Scanner;

public class BucleFor10 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        long n1,n2,i,j, contadori, contadorj;
        contadori=0;
        contadorj=0;

        System.out.println("Escribe un numero");
        n1 = sc.nextLong();
        System.out.println("Escribe otro numero");
        n2 = sc.nextLong();

        for ( i=1 ; i<=n1 ; i++) {
            if (n1%i==0){
                contadori++;
            }
        }

        if (contadori<=2){
            System.out.println(+n1+ " tiene " +contadori+ " numeros primos ");
        }else{
            System.out.println("El numero " +n1+ " no es primo");
        }

        for (j=1 ; j<=n2 ; j++) {
            if (n2%j==0){
                contadorj++;
            }
        }

        if (contadorj<=2){
            System.out.println(+n2+ " tiene " +contadorj+ " numeros primos ");
        }else{
            System.out.println("El numero " +n2+ " no es primo");
        }
    }
}
