import java.util.Scanner;

public class Tarea8Bejercicio4 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num, i, positivo, negativo, contador;
        positivo=0;
        negativo=0;

        System.out.println("Dime 10 numeros, te dire cuantos son positivos y cuantos negativos");


        for(i=1; i<=10; i++){

            num= sc.nextInt();

            if (num>=0){
                positivo++;
            }

            if (num<0){
                negativo++;
            }
            System.out.println("Te quedan " +(10-i));
        }
        System.out.println("De los numeros introducidos " +positivo+ " son positivos y " +negativo+ " son negativos");
    }
}
