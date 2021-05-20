import java.util.Arrays;

public class Ejercicio18_cadena {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            do {
                array[i] = (int) (Math.random()*(100-2))+2;
            } while (array[i]==0);
        }
        System.out.println(Arrays.toString(array));


        for (int i = 0; i < array.length; i++) {

            String cadena = Integer.toString(array[i]);
            String c="";

            for (int j = cadena.length()-1; j >=0 ; j--) {
                c +=cadena.charAt(j);
            }

            if(esPrimo(array[i])){

                if(cadena.equals(c)){
                    System.out.println("El numero "+ array[i]+ " es Primo y Capicua");
                } else{
                    System.out.println("El numero "+ array[i]+ " es Primo y NO es Capicua");
                }

            } else{
                if(cadena.equals(c)){
                    System.out.println("El numero "+ array[i]+ " NO es Primo y es Capicua");
                } else{
                    System.out.println("El numero "+ array[i]+ " NO es Primo y NO es Capicua");
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

}
