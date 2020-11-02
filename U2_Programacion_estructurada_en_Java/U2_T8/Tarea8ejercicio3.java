import java.util.Scanner;

public class Tarea8ejercicio3 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int num, aleatorio;
        num=0;

       aleatorio = (int) (Math.random()* (101-1)+1);

        System.out.println("Hemos escrito un numero aleatorio del 1 al 100. Si te rendiste escribe -1");
        System.out.println(aleatorio);
        System.out.println("Intenta adivinarlo");


        while (num!=aleatorio){
            num= sc.nextInt();

            if (num>aleatorio){
                System.out.println("El numero es menor");
            }

            if (num<aleatorio){
                System.out.println("El numero es mayor");
            }

            if (num==-1){
                System.out.println("Te rendiste... El numero era " +aleatorio);
                break;
            }

            if (num==aleatorio){
                System.out.println("¡Acertaste!");
            }
        }


    }



}
