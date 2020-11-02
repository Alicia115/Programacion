import java.util.Scanner;

public class Tarea8ejercicio15 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num,i,contador, divisor, primo;
        primo=0;

        System.out.println("Dime un numero hasta donde contar");
        num= sc.nextInt();

        for (i=1; i<=num; i++){
            contador=0;
            divisor=0;
            while ((divisor<=i) && (contador<=2)){
                divisor++;
                if (i%divisor==0){
                    contador++;
                }
            }

            if (contador<=2){
                System.out.println(i+ "-> PRIMO");
                primo++;
            }
            if (contador>2){
                System.out.println(i+ "-> NO PRIMO");
            }
        }
        System.out.println("Entre 1 y " +num+ " hay " +primo+ " números primos");
    }
}
