import java.util.Scanner;

public class Ejercicio_3 {

//    Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas
//            (la cadena a adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar.
//    Debe devolver el resultado de encontrar ese caracter en la cadena a adivinar.
//    Por ejemplo:
//    palabraAhorcado("programacion","------------",'o') debe devolver "--o-------o-"
//    palabraAhorcado("programacion","--o-------on",'a') debe devolver "--o--a-a--o-"
//    palablraAhorcado("hola","----",'x') debe devolver "----"

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String palabra;
        String contando="";
        String letra;

        System.out.println("Mete la palabra que hay que averiguar");
        palabra = sc.next();
        System.out.println(palabra);

        for (int i = 0; i < palabra.length(); i++) {
            contando+= "_";
        }
        System.out.println(contando);

        System.out.println("Juguemos, introduce letra");
        letra= sc.next();

        System.out.println(palabraAhorcado(palabra,contando,letra));

    }

    public static String palabraAhorcado (String adivinar, String resultado, String caracter){

        String premio="";
        String solucion="";

        for (int i = 0; i < adivinar.length(); i++) {
            solucion+= Character.toString(adivinar.charAt(i));
        }
        if (solucion.equals(caracter)){
            premio+=caracter;
        } else {
            premio+=resultado;
        }
        return premio;
    }

}
