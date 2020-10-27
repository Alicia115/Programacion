import java.util.Scanner;

public class BucleWhile6 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int n1,n2;

        System.out.println("Escriba su usuario, de 4 digitos");
        n1 = sc.nextInt();

        while (n1!=1809){
            System.out.println("usuario incorrecto. Inténtelo de nuevo");

            n1 = sc.nextInt();
        }
        System.out.println("¡Usuario correcto! Introduzca contraseña");
        n2 = sc.nextInt();

        while (n2!=1234){
            System.out.println("Contraseña incorrecta. Inténtelo de nuevo");

            n2 = sc.nextInt();
        }
        System.out.println("¡Contraseña correcta! ¡Ha entrado!");
    }
}
