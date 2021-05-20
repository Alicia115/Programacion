import java.util.Arrays;

public class Ejercicio19 {

    public static void main(String[] args) {
        int[][] array = new int[10][10];

        for (int i = 0; i <array.length ; i++) {

            for (int j = 0; j < array[0].length; j++) {
                array[i][j]= (int) (Math.random()*(100-1)+1);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        
        System.out.println(Arrays.deepToString(array));

        System.out.println(nEsimo(array,5));

    }

    public static int nEsimo(int[][]n, int posicion){

        int pos = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {

                if (pos == posicion){
                    return n[i][j];
                }
                pos++;
            }
        }

        return -1;
    }

    //Forma Matematica de hacerlo

    public static int nEsimo2(int[][]n, int posicion){

        int pos = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if ((n[0].length*i)+j==posicion){
                    return n[i][j];
                }
            }
        }

        return -1;
    }
}
