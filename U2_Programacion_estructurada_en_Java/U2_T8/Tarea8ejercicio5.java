import java.util.Scanner;

public class Tarea8ejercicio5 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n1,n2,num;
        num=0;


        System.out.println("Dime los rangos máximo y mínimo de un numero");
        System.out.println("Dame el minimo");
        n1= sc.nextInt();
        System.out.println("Dame el máximo");
        n2= sc.nextInt();
        System.out.println("Dame un numero que este dentro del rango que has marcado");
        num= sc.nextInt();

        while ((num<n1) || (num>n2)){
            System.out.println("Ese numero no está dentro del rango, prueba de nuevo");
            num= sc.nextInt();
        }
        System.out.println("¡Perfecto!");
    }
}
