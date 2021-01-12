import java.util.Arrays;

public class Ejercicio_5 {
//    Crea dos funciones que trabajen com arrays de dos dimensiones:
//
//    int[][] eliminarFilasPares(int[][] matriz)
//    que devuelva el resultado de eliminar de matriz las filas pares
//    int[][] eliminarFilasImpares(int[][] matriz)
//    que devuelva el resultado de eliminar de matriz las filas impares

    public static void main(String[] args) {

        int[][] principal = new int[4][4];

        for (int i = 0; i < principal.length; i++) {
            for (int j = 0; j < principal[0].length; j++) {
                principal[i][j]= (int) (Math.random()*(100-10)+10);
            }
        }
            System.out.println("Dada la siguiente matriz");
            System.out.println(Arrays.deepToString(principal));
            System.out.println("");
            System.out.println("El resultado de eliminarFilasPares será:");
            System.out.println(Arrays.deepToString(eliminarFilasPares(principal)));
            System.out.println("");
            System.out.println("El resultado de eliminarFilasImpares será:");
            System.out.println(Arrays.deepToString(eliminarFilasImpares(principal)));

    }

    public static  int[][] eliminarFilasPares(int[][] matriz){

        int[][] resultado = new int[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (esImpar(matriz[i][j])){
                    resultado= Arrays.copyOf(resultado, resultado.length+1);
                    resultado[resultado.length-1][resultado.length-1]=matriz[i][j];
                }
            }
        }
        return resultado;
    }

    public static int[][] eliminarFilasImpares(int[][] matriz){
        int[][] resultado = new int[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (esPar(matriz[i][j])){
                    resultado= Arrays.copyOf(resultado, resultado.length+1);
                    resultado[resultado.length-1][resultado.length-1]=matriz[i][j];
                }
            }
        }
        return resultado;
    }

    public static boolean esPar (int num){
            if (num/2!=0){
                return false;
            }
        return true;
    }

    public static boolean esImpar (int num){
        if (num/2==0){
            return false;
        }
        return true;
    }


}
