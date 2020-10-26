import java.util.Scanner;
public class Tarea5ejercicio4 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n1, n2, contador;

        contador = 0;


        System.out.println("Introduce un número");
        n1 = sc.nextInt();

        System.out.println("Introduce otro número");
        n2 = sc.nextInt();


        if (n1%2== 0){
            contador++;
        } if (n2%2== 0){
            contador++;
        }

        System.out.println("Los numeros pares son " +contador);
    }


}

