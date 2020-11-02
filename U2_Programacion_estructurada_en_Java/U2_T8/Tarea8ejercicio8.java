import java.util.Scanner;

public class Tarea8ejercicio8 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num,i, resultado;
        resultado=1;

        System.out.println("Dime un numero y calculamos su factorial");
        num= sc.nextInt();

        for (i=1; i<=num; i++){
            resultado=resultado*i;
        }

        System.out.println("El factorial de " +num+ " es " +resultado);
    }
}
