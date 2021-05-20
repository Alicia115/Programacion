import java.util.Arrays;

public class Ejercicio13 {
    public static void main(String[] args) {

        int[] v = {2,2,5,3,4,19,25,100,7,15,3};

        System.out.println(Arrays.toString(filtraPrimos(v)));

    }

    public static boolean esPrimo(int n){

        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int[]filtraPrimos(int x[]){

        int[] resultado = new int[0];

        for (int i = 0; i < x.length; i++) {

            if(esPrimo(x[i] )== true){
                resultado = Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]= x[i];
            }

        }

        return resultado;
    }

}
