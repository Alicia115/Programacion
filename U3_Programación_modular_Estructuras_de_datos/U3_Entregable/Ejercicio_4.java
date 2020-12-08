import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[5][9];
        int min=0,max=0, posMax, posMin=0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = (int) (Math.random()*(1001-100)+100);
                System.out.print(numeros[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if (i == 0 && j ==0){
                    min = numeros[i][j];
                } else{
                    if ( min>numeros[i][j]){
                         min = numeros[i][j];
                    }
                }

                if (i == 0 && j ==0){
                    max = numeros[i][j];
                } else{
                    if (max<numeros[i][j]){
                        max = numeros[i][j];
                    }
                }

            }
        }

        System.out.println("El numero minimo es " +min);
        System.out.println("El numero maximo es " +max);
    }
}
