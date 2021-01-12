import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int altura=0;

        System.out.println("Introduce la altura de la piramide maya, tiene que ser mayor de 3");
        altura= sc.nextInt();

        while (altura<3){
            System.out.println("Error, vuelve a introducirla, tiene que ser mayor o igual a 3");
            altura= sc.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if(i==0){
                    System.out.print("*");
                } else{
                    System.out.println(" ");
                }
            }
            System.out.println("");
        }

    }
}
