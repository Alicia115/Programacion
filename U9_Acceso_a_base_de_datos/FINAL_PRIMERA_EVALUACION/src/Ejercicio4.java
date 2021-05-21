import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {

        String[] pais = {"España", "Rusia", "Japón","Australia"};

        int media=0, min=0, max=0;

        int[][] estatura = new int[4][10];

        for (int i = 0; i < estatura.length; i++) {
            for (int j = 0; j < estatura[0].length; j++) {
                estatura[i][j] = (int) (Math.random()*(210-140)+140);
            }
        }

        System.out.println("----------------------------------------------------------------- MEDIA  |  MIN  |  MAX");

        for (int i = 0; i < estatura.length; i++) {

            media =0;
            min = estatura[i][0];
            max = 0;

            for (int j = 0; j < estatura[0].length; j++) {
                media += estatura[i][j];
                if (min>estatura[i][j]){
                    min = estatura[i][j];
                }
                if(max<estatura[i][j]){
                    max = estatura[i][j];
                }
            }

            System.out.println(pais[i]+ "  : "+ Arrays.toString(estatura[i]) + "  |  " + media/estatura[0].length + "     " + min + "     " + max);

        }



    }

}
