import java.util.Scanner;

public class BucleWhile4 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num,i;

        System.out.println("Escribe un numero");
        num = sc.nextInt();

        while (num!=0){
            System.out.println("El cuadrado de " +num+ " es " +(num*num));

            System.out.println("Escribe un numero");
            num = sc.nextInt();
        }
        System.out.println("Has introducido 0, el cuadrado de 0 es 0, no puedes introducir más números");
    }
}
