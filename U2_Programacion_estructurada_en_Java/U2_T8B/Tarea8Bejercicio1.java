import java.util.Scanner;

public class Tarea8Bejercicio1 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num, intentos;
        intentos=1;
        num=0;

        System.out.println("Introduce la contraseña de 4 digitos para abrir la caja");

        while ((num!=1234) && (intentos<=4) ){
            intentos++;
            num= sc.nextInt();
            if (num!=1234){
                if (intentos<=4){
                    System.out.println("Contraseña incorrecta, inténtelo de nuevo y recuerda que son 4 digitos");
                }
            }
        }

        if (num==1234){
            System.out.println("¡Perfecto! has abierto la caja, y lo has hecho en " +intentos+ " intentos");
        }else{
            System.out.println("ouh nou, ya has gastado todos los intentos");
        }
    }
}
