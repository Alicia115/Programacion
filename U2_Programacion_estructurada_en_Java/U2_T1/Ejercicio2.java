import java.util.Scanner;

public class Ejercicio2 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num, contador, n, cc, result;
        contador=0;
        cc=0;
        result=0;

        System.out.println("Introduzca un número entero positivo");
        num= sc.nextInt();

        while (num<=0){
            System.out.println("Introduzca un número entero positivo");
            num= sc.nextInt();
        }

        while (num>0) {
            cc = cc+1;
            n = num-(int)Math.floor(num/10)*10;
            num = (int)Math.floor(num/10);
            if((n==8) || (n==0)) {
                contador++;
            } else{
                result=result+n*(int)Math.pow(10,cc-contador-1);
            }
        }
        System.out.println("Número resultado " +result);
        System.out.println("Dígitos eliminados " +contador);
    }

}
