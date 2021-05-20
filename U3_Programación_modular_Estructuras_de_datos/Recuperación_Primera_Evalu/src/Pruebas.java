import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {

        int[] array = {1,2,33,4,555,6};

        System.out.println(Arrays.toString(insertar(array, 1, 57)));

    }


    public static int[] insertar(int[] v, int pos, int num) {
        int[] aux = new int[v.length + 1];
        for (int i = 0; i < aux.length; i++) {
            if (i < pos) {
                aux [i] += v[i];      // antes de la pos insertamos los mismos números que ya estaban
            } else if (i == pos) {
                aux [i] += num;        // si es igual, insertamos el número
            } else {
                aux [i] += v[i - 1];    // insertamos el resto de números
            }
        }
        return aux;
    }
}
