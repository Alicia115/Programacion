import java.util.Arrays;

public class Ejercicio18 {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = (int) (Math.random()*(100-2))+2;
            } while (array[i]==0);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if(esPrimo(array[i])){
                if (esCapicua(array[i])){
                    System.out.println("El número "+array[i]+ " es primo y es capicua");
                } else{
                    System.out.println("El número "+array[i]+ " es primo y NO es capicua");
                }
            } else{
                if (esCapicua(array[i])){
                    System.out.println("El número "+array[i]+ " NO es primo y es capicua");
                } else{
                    System.out.println("El número "+array[i]+ " NO es primo y NO es capicua");
                }
            }
        }


    }

    public static boolean esPrimo (int n){

        for (int i = 2; i < n; i++) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int voltea (int n){
        int resto =0, num = 0;

        while (n>0){
            resto = n%10;
            num *=10;
            num+=resto;
            n/=10;
        }
        return num;
    }

    public static boolean esCapicua (int n){
        if(n==voltea(n)){
            return true;
        }
        return false;
    }
}
