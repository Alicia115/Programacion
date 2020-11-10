import java.util.Scanner;

public class Tarea8Bejercicio5 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int altura,i, j;
        String caracter;

        System.out.println("Introduce el caracter con el que quieres que se pinte, ejemplo: a");
        caracter= sc.nextLine();
        System.out.println("Introduce la altura de la  piramide");
        altura= sc.nextInt();

        while ((altura<3) || (altura%2==0)){
            System.out.println("La altura tiene que ser mayor de 3");
            altura= sc.nextInt();
        }

        for (i=1; i<=altura; i++){
            for (j=1; j<=altura*2-1; j++){
                if ((i<=altura-j) || (j > (altura*2-1) - (altura-i)) ){
                    System.out.print(" ");
                } else {
                    System.out.print(caracter);
                }
            }
            System.out.println("");
        }

    }
}
