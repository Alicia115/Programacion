import java.util.Scanner;

public class Tarea8ejercicio7 {
    public static void main( String args[] ){

        Scanner sc = new Scanner(System.in);
        int i, contador, resultado;
        i=0;
        contador=0;
        resultado=1;
        while (contador<10){
            i++;

            if (i%2!=0){
                contador++;
                resultado=resultado*i;
                System.out.println(contador+ " - " +i);
            }
        }


        System.out.println("El producto de los 10 primeros numeros impares es " +resultado);

    }
}
