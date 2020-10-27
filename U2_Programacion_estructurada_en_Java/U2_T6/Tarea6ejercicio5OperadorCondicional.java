import java.util.Scanner;

public class Tarea6ejercicio5OperadorCondicional {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int r,n;
        double pi;
        pi =3.14;



        System.out.println("Escribe el valor del radio");
        r = sc.nextInt();

        System.out.println("1. Calcular diámetro");
        System.out.println("2. Calcular perímetro" );
        System.out.println("3. Calcular área");
        n = sc.nextInt();


        switch(n) {
            case 1: System.out.println("El diametro es igual a " +2*r); break;
            case 2: System.out.println("El perimetro es igual a " +(2*r)*pi); break;
            case 3: System.out.println("El área es igual a " +(pi*r)*r ); break;

        }

    }
}
