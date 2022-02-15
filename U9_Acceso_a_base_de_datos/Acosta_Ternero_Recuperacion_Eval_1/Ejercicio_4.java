import java.util.Arrays;

public class Ejercicio_4 {
    public static void main(String[] args) {

        int[] num = new int[100];
        int[] resultado = new int[0];

        for (int i = 0; i < num.length; i++) {
            num[i]= (int) (Math.random()*(100-18)+18);
        }

        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length; i++) {
            if (esPrimo(num[i])){
                resultado= Arrays.copyOf(resultado, resultado.length+1);
                resultado[resultado.length-1]=num[i];
            }
        }
        System.out.println("** " + Arrays.toString(resultado) + " **");
    }

    public static boolean esPrimo (int num){
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

}
