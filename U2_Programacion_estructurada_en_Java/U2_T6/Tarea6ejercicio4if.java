import java.util.Scanner;

public class Tarea6ejercicio4if {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        byte n1, n2;
        double menor;


        System.out.println("Escribe un numero");
        n1 = sc.nextByte();
        System.out.println("Escribe un numero");
        n2 = sc.nextByte();


        if (n1>n2){
            menor = n2;
        } else{
            menor = n1;
        }
        System.out.println("El numero menor es " +menor);
    }
}
