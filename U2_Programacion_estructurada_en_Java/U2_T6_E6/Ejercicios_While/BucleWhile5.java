import java.util.Scanner;

public class BucleWhile5 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Escribe una contraseña de 4 digitos");
        num = sc.nextInt();

        while (num!=1234){
            System.out.println("Contraseña incorrecta. Inténtelo de nuevo");

            num = sc.nextInt();
        }
        System.out.println("¡Contraseña correcta!");
    }
}

