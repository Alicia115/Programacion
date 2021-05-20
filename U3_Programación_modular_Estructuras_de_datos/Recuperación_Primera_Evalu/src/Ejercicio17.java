import java.util.Arrays;

public class Ejercicio17 {

    public static void main(String[] args) {

        int[] array = {1,2,33,4,555,6};

        System.out.println(ArrayEnString(array));

    }

    public static String ArrayEnString(int[]a){

        String resultado="";
        String cadena;

        for (int i = 0; i < a.length; i++) {

            cadena = Integer.toString(a[i]);
            resultado+= cadena;
        }
        return resultado;
    }
}
